package com.health.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.health.bean.MentalityResult;
import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.exception.CustomException;
import com.health.mapper.MentalityResultMapper;
import com.health.vo.BodyQueryVO;
import com.health.vo.MentalityQueryVO;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 心理测评接口实现类
 */
@Service
@Transactional
public class MentalityServiceImpl implements MentalityService {

    @Autowired
    private MentalityResultMapper mentalityResultMapper;

    /**
     * 分页查询心理测评信息
     *
     * @param queryPageBean
     * @return
     */
    @Override
    public PageResult<MentalityQueryVO> queryBodyEvaluation(QueryPageBean queryPageBean) {
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
            PageInfo<MentalityQueryVO> pageInfo = null;

            //使用pageHelper插件
            PageHelper.startPage(currentPage, pageSize);

            // 获取查询结果集
            List<MentalityQueryVO> mentalityQueryVOS = mentalityResultMapper.queryMentalityInfos(queryString);
            // 实例化分页对象
            pageInfo = new PageInfo<>(mentalityQueryVOS);
            // 返回实例化自定义分页对象
            return new PageResult<>(pageInfo.getTotal(), pageInfo.getList());
        } else {
            throw new CustomException("分页查询条件为空!");
        }
    }

    /**
     * 根据主键编号删除心理测评信息(逻辑删除)
     *
     * @param id
     * @return
     */
    @Override
    public int deleteById(Integer id) {
        if (ObjectUtils.isEmpty(id)){
            throw new CustomException("需删除的心理测评信息的主键为空!");
        }
        // 根据主键查询心理测评信息对象
        MentalityResult mentalityResult = mentalityResultMapper.selectByPrimaryKey(id);
        // 设置属性
        mentalityResult.setStatus("1");
        // 修改指定对象信息
        return mentalityResultMapper.updateByPrimaryKeySelective(mentalityResult);
    }
}
