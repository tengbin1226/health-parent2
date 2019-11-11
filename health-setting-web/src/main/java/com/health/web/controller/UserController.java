package com.health.web.controller;

import com.health.bean.User;
import com.health.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Reference(check = false)
    private UserService userService;


    @GetMapping("/loging/{userName}")
    public User loginPage(@PathVariable String userName) {
        User user = userService.queryUserByUserName(userName);
        return user;
    }

}
