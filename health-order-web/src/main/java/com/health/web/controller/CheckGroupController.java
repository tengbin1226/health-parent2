package com.health.web.controller;

import com.health.bean.CheckGroup;
import com.health.constant.MessageConstant;
import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.entity.Result;
import com.health.service.CheckService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 检查组后端控制器
 */
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "", methods = {})
@Controller
@RequestMapping("/checkgroup")
public class CheckGroupController {

    @Reference(check = false)
    private CheckService checkService;

    /**
     * 跳转到检查组页面
     *
     * @return
     */
    @GetMapping("/checkgroup")
    public String toCheckgroupPage() {
        return "checkgroup";
    }


    /**
     * 检查组信息分页查询
     *
     * @param queryPageBean
     * @return
     */
    @PostMapping("/checkgroups")
    @ResponseBody
    public PageResult<CheckGroup> queryCheckGroups(@RequestBody QueryPageBean queryPageBean) {
        return checkService.queryCheckGroup(queryPageBean.getCurrentPage(), queryPageBean.getPageSize(), queryPageBean.getQueryString());
    }


    /**
     * 根据编号查询检查组信息
     *
     * @param id
     * @return
     */
    @GetMapping("/checkgroup/{id}")
    @ResponseBody
    public CheckGroup queryCheckgroupById(@PathVariable Integer id) {
        return checkService.queryCheckgroupById(id);
    }


    /**
     * 根据编号删除检查组信息
     *
     * @param id
     * @return
     */
    @GetMapping("/deletegroup/{id}")
    @ResponseBody
    public Result deleteCheckgroupById(@PathVariable Integer id) {

        Boolean flag = checkService.deleteCheckgroupById(id);

        if (flag) {
            return new Result(true, MessageConstant.DELETE_CHECKGROUP_SUCCESS, flag);
        }
        return new Result(false, MessageConstant.DELETE_CHECKGROUP_FAIL, flag);
    }


    /**
     * 添加检查组信息
     *
     * @param checkiTem
     * @return
     */
    @PostMapping("/addcheckgroup")
    @ResponseBody
    public Result addCheckGroup(@RequestBody CheckGroup checkGroup, Integer[] checkitemIds) {

        int i = checkService.addCheckgroup(checkGroup, checkitemIds);

        if (i > 0) {
            return new Result(true, MessageConstant.ADD_CHECKITEM_SUCCESS, i);
        }
        return new Result(true, MessageConstant.ADD_CHECKITEM_FAIL, i);
    }


    /**
     * 修改检查组信息
     *
     * @param checkiTem
     * @return
     */
    @RequestMapping("/edit")
    @ResponseBody
    public Result updateCheckgreoup(@RequestBody CheckGroup checkGroup, Integer[] checkitemIds) {

        int i = checkService.updateCheckgroup(checkGroup, checkitemIds);

        if (i > 0) {
            return new Result(true, MessageConstant.EDIT_CHECKITEM_SUCCESS, i);
        }
        return new Result(false, MessageConstant.EDIT_CHECKITEM_FAIL, null);
    }

}
