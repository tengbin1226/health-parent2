package com.health.web.controller;


import com.health.bean.Menu;
import com.health.constant.MessageConstant;
import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.entity.Result;
import com.health.service.MenuService;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "", methods = {})
@Controller
@RequestMapping("/menu")
public class MenuController {

    @Reference
    private MenuService menuService;

    /**
     * 跳转到菜单页面
     *
     * @return
     */
    @GetMapping("/menu")
    public String toMenuPage() {
        return "menu";
    }

    /**
     * 分页查询菜单信息
     *
     * @param queryPageBean
     * @return
     */
    @PostMapping("/menu")
    @ResponseBody
    public PageResult<Menu> queryMenus(@RequestBody QueryPageBean queryPageBean) {
        PageResult<Menu> result = menuService.queryMenusByPage(queryPageBean.getCurrentPage(), queryPageBean.getPageSize(), queryPageBean.getQueryString());
        return result;
    }

    /**
     * 逻辑删除
     *
     * @param id
     * @return
     */
    @GetMapping("/menu/{id}")
    @ResponseBody
    public Result deleteMenu(@PathVariable Integer id) {
        Result result = new Result();

        if (ObjectUtils.isNotEmpty(id)) {
            Boolean flag = menuService.deleteById(id);
            // 设置属性
            result.setFlag(flag);
            result.setMessage(MessageConstant.DELETE_MENU_SUCCESS);
            result.setData(null);
        } else {
            // 设置属性
            result.setFlag(false);
            result.setMessage(MessageConstant.DELETE_MENU_FAIL);
            result.setData(null);
        }
        return result;
    }


    /**
     * 根据编号查询菜单信息
     *
     * @param id
     * @return
     */
    @GetMapping("/menuInfo/{id}")
    @ResponseBody
    public Result queryById(@PathVariable Integer id) {

        Result result = new Result();

        if (ObjectUtils.isNotEmpty(id)) {
            Menu menu = menuService.findById(id);
            result.setFlag(true);
            result.setMessage(MessageConstant.GET_MENUBYID_SUCCESS);
            result.setData(menu);
        } else {
            result.setFlag(false);
            result.setMessage(MessageConstant.GET_MENUBYID_FAIL);
            result.setData(null);
        }
        return result;
    }

    /**
     * 修改菜单信息
     *
     * @param menu
     * @return
     */
    @PostMapping("/updatemenu")
    @ResponseBody
    public Result updateMenu(@RequestBody Menu menu) {
        Result result = new Result();
        if (ObjectUtils.isNotEmpty(menu)) {
            Boolean flag = menuService.updateMenuInfo(menu);
            // 设置属性
            result.setFlag(true);
            result.setMessage(MessageConstant.GET_UPDATEMENU_SUCCESS);
            result.setData(null);
        } else {
            // 设置属性
            result.setFlag(false);
            result.setMessage(MessageConstant.GET_UPDATEMENU_FAIL);
            result.setData(null);
        }
        return result;
    }


    /**
     * 添加菜单信息
     *
     * @param menu
     * @return
     */
    @PostMapping("/addmenu")
    @ResponseBody
    public Result addMenu(@RequestBody Menu menu) {
        Result result = new Result();
        if (ObjectUtils.isNotEmpty(menu)) {
            Boolean flag = menuService.addMenuInfo(menu);
            // 设置属性
            result.setFlag(true);
            result.setMessage(MessageConstant.GET_ADDMENU_SUCCESS);
            result.setData(null);
        } else {
            // 设置属性
            result.setFlag(false);
            result.setMessage(MessageConstant.GET_ADDMENU_FAIL);
            result.setData(null);
        }
        return result;
    }


}
