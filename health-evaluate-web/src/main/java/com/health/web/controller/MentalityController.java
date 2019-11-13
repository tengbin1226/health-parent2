package com.health.web.controller;

import com.health.constant.MessageConstant;
import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.entity.Result;
import com.health.service.MentalityService;
import com.health.vo.MentalityQueryVO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 心理测评后端控制器
 */
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "", methods = {})
@Controller
@RequestMapping("/mentality")
public class MentalityController {

    @Reference(check = false)
    private MentalityService mentalityService;

    /**
     * 跳转到心理测评页面
     *
     * @return
     */
    @GetMapping("/mentality")
    public String toMentalityPage() {
        return "mentality";
    }


    /**
     * 分页查询心理测评信息
     *
     * @param queryPageBean
     * @return
     */
    @PostMapping("/query")
    @ResponseBody
    public PageResult<MentalityQueryVO> queryMentalityInfo(@RequestBody QueryPageBean queryPageBean) {
        return mentalityService.queryBodyEvaluation(queryPageBean);
    }


    @GetMapping("/deleteById/{id}")
    @ResponseBody
    public Result deleteById(@PathVariable Integer id) {
        int i = mentalityService.deleteById(id);
        if (i > 0) {
            return new Result(true, MessageConstant.DELETE_MENTALITY_SUCCESS, null);
        }
        return new Result(false, MessageConstant.DELETE_MENTALITY_FAIL, null);
    }

}
