package com.health.service;

import com.health.entity.PageResult;
import com.health.vo.OrderQueryVO;

public interface OrderService {

    /**
     * 分页查询预约信息
     *
     * @return
     */
    PageResult<OrderQueryVO> queryOrders(Integer currentPage, Integer pageSize, String queryString);
}
