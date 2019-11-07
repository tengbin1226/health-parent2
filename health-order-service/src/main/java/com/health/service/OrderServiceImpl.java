package com.health.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.health.bean.Menu;
import com.health.entity.PageResult;
import com.health.mapper.OrderMapper;
import com.health.vo.OrderQueryVO;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 预约接口实现类
 */
@Service
@Transactional
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderMapper orderMapper;

    /**
     * 分页查询预约信息
     *
     * @param currentPage
     * @param pageSize
     * @param queryString
     * @return
     */
    @Override
    public PageResult<OrderQueryVO> queryOrders(Integer currentPage, Integer pageSize, String queryString) {
        //拼接模糊查询的%
        if ("".equals(queryString) || StringUtils.isBlank(queryString)) {
            queryString = null;
        } else {
            queryString = "%" + queryString + "%";
        }
        // 初始化分页对象
        PageInfo<OrderQueryVO> pageInfo = null;

        //使用pageHelper插件
        PageHelper.startPage(currentPage, pageSize);

        List<OrderQueryVO> orders = orderMapper.selectOrderInfo(queryString);

        pageInfo=new PageInfo<>(orders);

        return new PageResult<>(pageInfo.getTotal(),pageInfo.getList());
    }
}
