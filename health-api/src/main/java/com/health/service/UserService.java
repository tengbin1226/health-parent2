package com.health.service;

import com.health.bean.User;

/**
 * 系统设置模块中的用户管理接口
 */
public interface UserService {
    /**
     * 根据用户名称查询用户信息
     *
     * @param userName
     * @return
     */
    User queryUserByUserName(String userName);
}
