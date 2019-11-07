package com.health.web.controller;

import com.health.bean.Menu;
import com.health.constant.MessageConstant;
import com.health.entity.Result;
import com.health.service.MenuService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 后台页面后端控制器
 */
@CrossOrigin(origins = "*",allowCredentials="true",allowedHeaders = "",methods = {})
@Controller
@RequestMapping("/backend")
public class BackendController {

    @Reference(check = false)
    private MenuService menuService;

    /**
     * 进入到登录页面
     * @return
     */
    @GetMapping("/health")
    public String toLoginPage(){
        return "login";
    }

    /**
     *  进入主页面
     * @return
     */
    @PostMapping("/login")
    public String toMainPage(){
        return "main";
    }

    /**
     * 动态加载菜单树
     * @return
     */
    @PostMapping("/menu")
    @ResponseBody
    public Result queryMenus(){

        // 实例化返回结果对象
        Result result=new Result();

        // 获取菜单查询结果集
        List<Menu> menus = menuService.queryMenuInfo();

        // 判断结果集,设置属性
        if (menus.size()>0) {
            result.setFlag(true);
            result.setMessage(MessageConstant.GET_MENU_SUCCESS);
            result.setData(menus);
        }else {
            result.setFlag(false);
            result.setMessage(MessageConstant.GET_MENU_FAIL);
            result.setData(null);
        }

        return result;
    }


}
