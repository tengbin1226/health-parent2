package com.health.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.health.bean.*;
import com.health.entity.PageResult;
import com.health.exception.CustomException;
import com.health.mapper.MenuMapper;
import com.health.mapper.PermissionMapper;
import com.health.mapper.RoleMapper;
import com.health.mapper.UserRoleMapper;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * 角色接口实现类
 */
@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    // 角色
    @Autowired
    private RoleMapper roleMapper;

    // 用户角色关联
    @Autowired
    private UserRoleMapper userRoleMapper;

    // 权限
    @Autowired
    private PermissionMapper permissionMapper;

    // 菜单
    @Autowired
    private MenuMapper menuMapper;

    /**
     * 查询所有角色信息
     *
     * @return
     */
    @Override
    public List<Role> queryRoles() {
        return roleMapper.selectByExample(null);
    }

    /**
     *  根据用户编号查询角色信息
     * @param id
     * @return
     */
    @Override
    public List<Role> queryRolesByUserId(Integer id) {
        if (ObjectUtils.isEmpty(id)){
            throw new CustomException("需要查询角色信息的用户编号为空!");
        }
        // 初始化
        List<Role> roles=new ArrayList<>();

        // TODO 根据用户编号查询用户与角色关联信息
        UserRoleExample userRoleExample=new UserRoleExample();
        UserRoleExample.Criteria criteria = userRoleExample.createCriteria();
        criteria.andUserIdEqualTo(id);
        List<UserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);

        for (UserRole userRole : userRoles) {
            Role role = roleMapper.selectByPrimaryKey(userRole.getRoleId());
            roles.add(role);
        }

        return roles;
    }

    /**
     * 分页查询角色信息
     *
     * @param queryPageBean
     * @return
     */
    @Override
    public PageResult<Role> queryAllRoles(Integer currentPage, Integer pageSize, String queryString) {

        //拼接模糊查询的%
        if ("".equals(queryString) || StringUtils.isBlank(queryString)) {
            queryString = null;
        } else {
            queryString = "%" + queryString + "%";
        }
        // 初始化分页对象
        PageInfo<Role> pageInfo = null;

        //使用pageHelper插件
        PageHelper.startPage(currentPage, pageSize);

        // 获取查询结果集
        List<Role> roles=roleMapper.selectRoleByPage(queryString);

        // 根据结果集实例化分页对象
        pageInfo=new PageInfo<>(roles);

        // 返回自定义分页对象
        return new PageResult<>(pageInfo.getTotal(),pageInfo.getList());
    }

    /**
     * 查询所有权限信息
     *
     * @return
     */
    @Override
    public List<Permission> findAllPermissions() {
        return permissionMapper.selectByExample(null);
    }

    /**
     * 查询所有菜单信息
     *
     * @return
     */
    @Override
    public List<Menu> findAllMenus() {
        return menuMapper.selectByExample(null);
    }
}
