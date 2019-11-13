package com.health.web.controller;

import com.health.bean.User;
import com.health.constant.MessageConstant;
import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.entity.Result;
import com.health.service.UserService;
import com.health.vo.UserQueryVO;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "", methods = {})
@Controller
@RequestMapping("/user")
public class UserController {

    // 用户
    @Reference(check = false)
    private UserService userService;

    /**
     * 跳转到用户管理页面
     *
     * @return
     */
    @GetMapping("/user")
    public String toUserPage() {
        return "user";
    }

    /**
     * 分页查询用户信息
     *
     * @param queryPageBean
     * @return
     */
    @PostMapping("/queryusers")
    @ResponseBody
    public PageResult<UserQueryVO> userQueryVOPageResult(@RequestBody QueryPageBean queryPageBean) {
        return userService.queryUserInfo(queryPageBean);
    }


    /**
     * 根据主键编号删除用户信息(逻辑删除)
     * @param id
     * @return
     */
    @GetMapping("/deleteById/{id}")
    @ResponseBody
    public Result deleteUserById(@PathVariable Integer id) {
        int i = userService.deleteUserById(id);
        if (i > 0) {
            return new Result(true, MessageConstant.DELETE_USER_SUCCESS, null);
        }
        return new Result(false, MessageConstant.DELETE_USER_FAIL, null);
    }


    /**
     *  根据主键编号查询用户信息
     * @param id
     * @return
     */
    @GetMapping("/findById/{id}")
    @ResponseBody
    public Result queryUserById(@PathVariable Integer id){
        // 根据主键查询用户信息
        User user = userService.queryUserById(id);
        if (ObjectUtils.isEmpty(user)){
            return new Result(false,MessageConstant.GET_USERBYID_FAIL,null);
        }
        return new Result(true, MessageConstant.GET_USERBYID_SUCCESS,user);
    }



    /**
     * 根据用户名查询用户信息
     *
     * @param userName
     * @return
     */
    @GetMapping("/findByName/{userName}")
    @ResponseBody
    public User loginPage(@PathVariable String userName) {
        User user = userService.queryUserByUserName(userName);
        return user;
    }

}
