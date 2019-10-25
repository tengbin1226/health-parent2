package com.health.service;


import com.health.bean.User;
import com.health.bean.UserExample;
import com.health.mapper.UserMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据用户名称查询用户信息
     *
     * @param userName
     * @return
     */
    @Override
    public User queryUserByUserName(String userName) {
        if (StringUtils.isBlank(userName)) {
            return null;
        }
        //设置查询条件
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(userName);
        // 获取查询结果集
        List<User> users = userMapper.selectByExample(example);
        return users.get(0);
    }
}
