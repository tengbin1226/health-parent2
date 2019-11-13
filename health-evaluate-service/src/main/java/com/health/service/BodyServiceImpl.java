package com.health.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.health.bean.BodyTest;
import com.health.bean.BodyType;
import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.exception.CustomException;
import com.health.mapper.BodyTestMapper;
import com.health.mapper.BodyTypeMapper;
import com.health.vo.BodyQueryVO;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 健康评测实现类
 */
@Service
@Transactional
public class BodyServiceImpl implements BodyService {

    @Autowired
    private BodyTypeMapper bodyTypeMapper;

    @Autowired
    private BodyTestMapper bodyTestMapper;

    /**
     * 分页查询体质测评信息
     *
     * @param queryString
     * @return
     */
    @Override
    public PageResult<BodyQueryVO> queryBodyEvaluation(QueryPageBean queryPageBean) {
        if (ObjectUtils.isNotEmpty(queryPageBean)) {
            // 获取查询条件,页数,每页显示的数据记录数
            String queryString = queryPageBean.getQueryString();
            Integer currentPage = queryPageBean.getCurrentPage();
            Integer pageSize = queryPageBean.getPageSize();

            //拼接模糊查询的%
            if ("".equals(queryString) || StringUtils.isBlank(queryString)) {
                queryString = null;
            } else {
                queryString = "%" + queryString + "%";
            }
            // 初始化分页对象
            PageInfo<BodyQueryVO> pageInfo = null;

            //使用pageHelper插件
            PageHelper.startPage(currentPage, pageSize);

            // 获取查询结果集
            List<BodyQueryVO> bodytypes = bodyTypeMapper.selectBodyInfo(queryString);
            // 实例化分页对象
            pageInfo=new PageInfo<>(bodytypes);
            // 返回实例化自定义分页对象
            return new PageResult<>(pageInfo.getTotal(),pageInfo.getList());
        }else {
            throw new CustomException("分页查询条件为空!");
        }
    }

    /**
     * 查询所有体质调查问题
     * @return
     */
    @Override
    public List<BodyTest> queryTests() {
        return bodyTestMapper.selectByExample(null);
    }


    /**
     * 根据编号删除体质测评信息(逻辑删除)
     *
     * @param id
     * @return
     */
    @Override
    public Boolean deleteById(Integer id) {
        if(ObjectUtils.isEmpty(id)){
            throw new CustomException("未获取到需删除的体质测评信息主键!");
        }
        // 1.根据主键查询体质测评信息
        BodyType bodyType = bodyTypeMapper.selectByPrimaryKey(id);
        // 2.根据体质测评信息对象设置属性
        bodyType.setStatus("1");
        // 3.根据主键修改信息
        int i = bodyTypeMapper.updateByPrimaryKeySelective(bodyType);

        return i>0;
    }
}
