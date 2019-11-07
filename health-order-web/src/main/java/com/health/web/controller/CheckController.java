package com.health.web.controller;

import com.health.bean.CheckGroup;
import com.health.bean.CheckGroupCheckiTem;
import com.health.bean.CheckiTem;
import com.health.constant.MessageConstant;
import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.entity.Result;
import com.health.service.CheckService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 检查组/项后端控制器
 */
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "", methods = {})
@Controller
@RequestMapping("/check")
public class CheckController {

    @Reference(check = false)
    private CheckService checkService;


    /**
     * 跳转到检查项页面
     *
     * @return
     */
    @GetMapping("/checkitem")
    public String toCheckItemPage() {
        return "checkitem";
    }

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
     * 检查项信息分页查询
     *
     * @param queryPageBean
     * @return
     */
    @PostMapping("/checkitems")
    @ResponseBody
    public PageResult<CheckiTem> queryCheckItems(@RequestBody QueryPageBean queryPageBean) {
        return checkService.queryCheckItem(queryPageBean.getCurrentPage(), queryPageBean.getPageSize(), queryPageBean.getQueryString());
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
     * 查询所有检查组信息,用于页面动态加载
     *
     * @return
     */
    @GetMapping("/findAllItem")
    @ResponseBody
    public List<CheckiTem> queryAllCheckitems() {
        return checkService.queryAllCheckitems();
    }


    /**
     * 根据编号查询检查项信息
     *
     * @param id
     * @return
     */
    @GetMapping("/checkitem/{id}")
    @ResponseBody
    public CheckiTem queryCheckitemById(@PathVariable Integer id) {
        CheckiTem checkiTem = checkService.queryCheckitemById(id);
        return checkiTem;
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
        CheckGroup checkGroup = checkService.queryCheckgroupById(id);
        return checkGroup;
    }

    /**
     * 根据检查组编号查询检查项信息
     *
     * @param id
     * @return
     */
    @GetMapping("/findItemById/{id}")
    @ResponseBody
    public List<CheckGroupCheckiTem> queryItemsById(@PathVariable Integer id) {
        return checkService.querycheckItemsByCheckGroupId(id);
    }


    /**
     * 根据编号删除检查项信息
     *
     * @param id
     * @return
     */
    @GetMapping("/deleteinfo/{id}")
    @ResponseBody
    public Result deleteCheckitemById(@PathVariable Integer id) {
        // 实例化返回结果对象
        Result result = new Result();

        int i = checkService.deleteCheckitemById(id);

        if (i > 0) {
            result.setFlag(true);
            result.setMessage(MessageConstant.DELETE_CHECKITEM_SUCCESS);
            result.setData(i);
        } else {
            result.setFlag(false);
            result.setMessage(MessageConstant.DELETE_CHECKITEM_FAIL);
            result.setData(i);
        }
        return result;
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
        // 实例化返回结果对象
        Result result = new Result();

        int i = checkService.deleteCheckgroupById(id);

        if (i > 0) {
            result.setFlag(true);
            result.setMessage(MessageConstant.DELETE_CHECKGROUP_SUCCESS);
            result.setData(i);
        } else {
            result.setFlag(false);
            result.setMessage(MessageConstant.DELETE_CHECKGROUP_FAIL);
            result.setData(i);
        }
        return result;
    }


    /**
     * 添加检查项信息
     *
     * @param checkiTem
     * @return
     */
    @PostMapping("/addinfo")
    @ResponseBody
    public Result addCheckitem(@RequestBody CheckiTem checkiTem) {
        // 实例化返回对象
        Result result = new Result();

        int i = checkService.addCheckitem(checkiTem);

        if (i > 0) {
            result.setFlag(true);
            result.setMessage(MessageConstant.ADD_CHECKITEM_SUCCESS);
            result.setData(i);
        } else {
            result.setFlag(false);
            result.setMessage(MessageConstant.ADD_CHECKITEM_FAIL);
            result.setData(i);
        }
        return result;
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
        // 实例化返回结果对象
        Result result = new Result();

        int i = checkService.addCheckgroup(checkGroup, checkitemIds);

        if (i > 0) {
            result.setFlag(true);
            result.setMessage(MessageConstant.ADD_CHECKITEM_SUCCESS);
            result.setData(i);
        } else {
            result.setFlag(false);
            result.setMessage(MessageConstant.ADD_CHECKITEM_FAIL);
            result.setData(i);
        }
        return result;
    }


    /**
     * 修改检查项信息
     *
     * @param checkiTem
     * @return
     */
    @PostMapping("/updateinfo")
    @ResponseBody
    public Result updateCheckitem(@RequestBody CheckiTem checkiTem) {
        // 实例化返回结果对象
        Result result = new Result();

        int i = checkService.updateCheckitem(checkiTem);

        if (i > 0) {
            result.setFlag(true);
            result.setMessage(MessageConstant.EDIT_CHECKITEM_SUCCESS);
            result.setData(i);
        } else {
            result.setFlag(false);
            result.setMessage(MessageConstant.EDIT_CHECKITEM_FAIL);
            result.setData(i);
        }
        return result;
    }

    /**
     * 修改检查组信息
     *
     * @param checkiTem
     * @return
     */
    @PostMapping("/edit")
    @ResponseBody
    public Result updateCheckgreoup(@RequestBody CheckGroup checkGroup, Integer[] checkitemIds) {
        // 实例化返回结果对象
        Result result = new Result();

        int i = checkService.updateCheckgroup(checkGroup, checkitemIds);

        if (i > 0) {
            result.setFlag(true);
            result.setMessage(MessageConstant.EDIT_CHECKITEM_SUCCESS);
            result.setData(i);
        } else {
            result.setFlag(false);
            result.setMessage(MessageConstant.EDIT_CHECKITEM_FAIL);
            result.setData(i);
        }
        return result;
    }

}
