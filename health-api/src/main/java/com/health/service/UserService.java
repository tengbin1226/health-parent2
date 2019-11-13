package com.health.service;

import com.health.bean.User;
import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.vo.UserQueryVO;

/**
 * 系统设置模块中的用户管理接口
 */
public interface UserService {

    /**
     * 分页查询用户信息
     * @param queryPageBean
     * @return
     */
    PageResult<UserQueryVO> queryUserInfo(QueryPageBean queryPageBean);

    /**
     * 根据主键编号删除用户信息(逻辑删除)
     * @param id
     * @return
     */
    int deleteUserById(Integer id);

    /**
     * 根据编号查询用户信息
     * @param id
     * @return
     */
    User queryUserById(Integer id);


    /**
     * 根据用户名称查询用户信息
     *
     * @param userName
     * @return
     */
    User queryUserByUserName(String userName);
}
