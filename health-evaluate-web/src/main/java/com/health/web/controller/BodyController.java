package com.health.web.controller;

import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.service.BodyService;
import com.health.vo.BodyQueryVO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 体质测评后端控制器
 */
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "", methods = {})
@Controller
@RequestMapping("/body")
public class BodyController {

    @Reference(check = false)
    private BodyService bodyService;

    /**
     * 跳转到体质测评页面
     * @return
     */
    @GetMapping("/body")
    public String toBodyPage(){
        return "physique";
    }


    @PostMapping("/queryinfo")
    @ResponseBody
    public PageResult<BodyQueryVO> queryBodyInfo(@RequestBody QueryPageBean queryPageBean){
       return  bodyService.queryBodyEvaluation(queryPageBean);
    }


}
