package com.health.web.controller;

import com.health.bean.BodyTest;
import com.health.constant.MessageConstant;
import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.entity.Result;
import com.health.service.BodyService;
import com.health.vo.BodyQueryVO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


    /**
     * 分页查询测评信息
     * @param queryPageBean
     * @return
     */
    @PostMapping("/queryinfo")
    @ResponseBody
    public PageResult<BodyQueryVO> queryBodyInfo(@RequestBody QueryPageBean queryPageBean){
       return  bodyService.queryBodyEvaluation(queryPageBean);
    }


    /**
     * 查询所有问卷调查信息
     * @return
     */
    @PostMapping("/queryTest")
    @ResponseBody
    public List<BodyTest> queryBodyTest(){
        return bodyService.queryTests();
    }


    /**
     * 根据主键编号删除指定记录数据
     * @param id
     * @return
     */
    @GetMapping("/deleteById/{id}")
    @ResponseBody
    public Result deleteById(@PathVariable Integer id){

        // 初始化返回结果对象
        Result result=new Result();

        Boolean flag = bodyService.deleteById(id);

        if (flag) {
            // 设置属性
            result.setMessage(MessageConstant.DELETE_BODY_SUCCESS);
            result.setFlag(true);
        } else {
            // 设置属性
            result.setMessage(MessageConstant.DELETE_BODY_FAIL);
            result.setFlag(false);
        }
        return result;
    }

}
