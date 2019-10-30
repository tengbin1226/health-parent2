package com.health.service;

import com.health.entity.PageResult;
import com.health.vo.OrderQueryVO;

/**
 * 预约接口实现类
 */
public class OrderServiceImpl implements OrderService{

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
        return null;
    }
}
