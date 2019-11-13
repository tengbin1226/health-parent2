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

import java.util.List;

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
    @PostMapping("/menus")
    @ResponseBody
    public PageResult<Menu> queryMenus(@RequestBody QueryPageBean queryPageBean) {
        PageResult<Menu> result = menuService.queryMenusByPage(queryPageBean.getCurrentPage(), queryPageBean.getPageSize(), queryPageBean.getQueryString());
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
        Boolean flag = menuService.addMenuInfo(menu);
        if (flag) {
            return new Result(true, MessageConstant.GET_ADDMENU_SUCCESS, null);
        }
        return new Result(false, MessageConstant.GET_ADDMENU_FAIL, null);
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
        Boolean flag = menuService.deleteById(id);
        if (flag) {
            return new Result(true, MessageConstant.DELETE_MENU_SUCCESS, null);
        }
        return new Result(false, MessageConstant.DELETE_MENU_FAIL, null);
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
        // 根据编号查询指定菜单对象
        Menu menu = menuService.findById(id);
        // 返回结果对象
        return new Result(true, MessageConstant.GET_MENUBYID_SUCCESS, menu);
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
        Boolean flag = menuService.updateMenuInfo(menu);
        if (flag) {
            return new Result(true, MessageConstant.GET_UPDATEMENU_SUCCESS, null);
        }
        return new Result(false, MessageConstant.GET_UPDATEMENU_FAIL, null);
    }


    /**
     * 查询所有父菜单信息
     * @return
     */
    @PostMapping("/queryparentmenus")
    @ResponseBody
    public List<Menu> queryParentMenus(){
        return menuService.querParentMenus();
    }

}
