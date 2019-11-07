package com.health.web.controller;

import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.service.OrderService;
import com.health.vo.OrderQueryVO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "", methods = {})
@Controller
@RequestMapping("/order")
public class OrderController {

    @Reference
    private OrderService orderService;

    /**
     * 预约列表页面
     *
     * @return
     */
    @GetMapping("/order")
    public String toOrderListPage() {
        return "ordersettinglist";
    }

    /**
     * 分页查询预约列表信息
     *
     * @param queryPageBean
     * @return
     */
    @PostMapping("/order")
    @ResponseBody
    public PageResult<OrderQueryVO> queryVOPageResult(@RequestBody QueryPageBean queryPageBean) {
        PageResult<OrderQueryVO> pageResult = orderService.queryOrders(queryPageBean.getCurrentPage(), queryPageBean.getPageSize(), queryPageBean.getQueryString());
        return pageResult;
    }


}
