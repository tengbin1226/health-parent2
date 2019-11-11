package com.health.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.exception.CustomException;
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
}
