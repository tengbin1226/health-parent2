package com.health.controller;

import com.health.bean.User;
import com.health.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/backend")
public class BackendController {

    @Reference
    private UserService userService;

    /**
     * 进入后台登录页面
     *
     * @return
     */
    @GetMapping("/login")
    public String toLoginPage() {
        return "login";
    }

    @GetMapping("/workbench")
    public String toWorkbenchPage(@RequestParam String username, @RequestParam String password) {

        // 根据用户名查询用户信息
        User user1 = userService.queryUserByUserName(username);
        //判断用户信息是否为空
        if (ObjectUtils.isEmpty(user1)) {
            return "login";
        } else if (password.equals(user1.getPassword())) {
            return "workbench";
        }
        return "login";
    }


}
