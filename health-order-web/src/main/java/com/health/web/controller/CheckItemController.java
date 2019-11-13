package com.health.web.controller;

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

import java.util.List;

/**
 * 检查项后端控制器
 */
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "", methods = {})
@Controller
@RequestMapping("/checkitem")
public class CheckItemController {

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
     * 查询所有检查组信息,用于页面动态加载
     *
     * @return
     */
    @GetMapping("/findAllItem")
    @ResponseBody
    public Result queryAllCheckitems() {
        List<CheckiTem> checkiTems = checkService.queryAllCheckitems();
        return new Result(true, null, checkiTems);
    }

    /**
     * 根据检查组编号查询检查项信息
     *
     * @param id
     * @return
     */
    @GetMapping("/findItemById/{id}")
    @ResponseBody
    public Result queryItemsById(@PathVariable Integer id) {
        List<CheckGroupCheckiTem> checkGroupCheckiTems = checkService.querycheckItemsByCheckGroupId(id);
        return new Result(true, MessageConstant.GET_CHECKITEMBYID_SUCCESS, checkGroupCheckiTems);
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


}
