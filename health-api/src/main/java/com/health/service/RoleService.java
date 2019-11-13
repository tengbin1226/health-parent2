package com.health.service;

import com.health.bean.Menu;
import com.health.bean.Permission;
import com.health.bean.Role;
import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;

import java.util.List;

/**
 * 角色接口
 */
public interface RoleService {

    /**
     * 查询所有角色信息
     * @return
     */
    List<Role> queryRoles();

    /**
     *  根据用户编号查询用户所拥有的角色信息
     * @param id
     * @return
     */
    List<Role> queryRolesByUserId(Integer id);

    /**
     * 分页查询角色信息
     * @param queryPageBean
     * @return
     */
    PageResult<Role> queryAllRoles(Integer currentPage, Integer pageSize, String queryString);

    /**
     * 查询所有权限信息
     * @return
     */
    List<Permission> findAllPermissions();

    /**
     * 查询所有菜单信息
     * @return
     */
    List<Menu> findAllMenus();
}
