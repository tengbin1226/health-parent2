package com.health.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.health.bean.Menu;
import com.health.bean.User;
import com.health.bean.UserExample;
import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.exception.CustomException;
import com.health.mapper.UserMapper;
import com.health.vo.BodyQueryVO;
import com.health.vo.UserQueryVO;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    /**
     * 分页查询用户信息
     *
     * @param queryPageBean
     * @return
     */
    @Override
    public PageResult<UserQueryVO> queryUserInfo(QueryPageBean queryPageBean) {
        if (ObjectUtils.isNotEmpty(queryPageBean)) {
            // 获取查询条件,页数,每页显示的数据记录数
            String queryString = queryPageBean.getQueryString();
            Integer currentPage = queryPageBean.getCurrentPage();
            Integer pageSize = queryPageBean.getPageSize();

            //拼接模糊查询的%
            if ("".equals(queryString) || StringUtils.isBlank(queryString)) {
                queryString = null;
            } else {
                queryString = "%" + queryString + "%";
            }
            // 初始化分页对象
            PageInfo<UserQueryVO> pageInfo = null;

            //使用pageHelper插件
            PageHelper.startPage(currentPage, pageSize);

            // 获取查询结果集
             List<UserQueryVO> users= userMapper.selectUervoInfo(queryString);
            // 实例化分页对象
            pageInfo=new PageInfo<>(users);
            // 返回实例化自定义分页对象
            return new PageResult<>(pageInfo.getTotal(),pageInfo.getList());
        }else {
            throw new CustomException("分页查询条件为空!");
        }
    }


    /**
     * 根据主键编号删除用户信息(逻辑删除)
     *
     * @param id
     * @return
     */
    @Override
    public int deleteUserById(Integer id) {
        if (ObjectUtils.isEmpty(id)){
            throw new CustomException("需删除的用户编号为空!");
        }
        // 1.根据主键查询用户信息
        User user = userMapper.selectByPrimaryKey(id);
        // 2.设置属性
        user.setStatus(1);
        // 3.修改用户状态为1(禁用).并返回受影响行数
        return userMapper.updateByPrimaryKeySelective(user);
    }


    /**
     * 根据编号查询用户信息
     *
     * @param id
     * @return
     */
    @Override
    public User queryUserById(Integer id) {
        if (ObjectUtils.isEmpty(id)){
            throw new CustomException("需查询的用户编号为空!");
        }
        return userMapper.selectByPrimaryKey(id);
    }

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
