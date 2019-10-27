package com.health.bean;

import java.io.Serializable;

/**
 * 角色菜单关联
 */
public class RoleMenuKey implements Serializable {

    private static final long serialVersionUID = -2282617924786654906L;

    private Integer roleId;

    private Integer menuId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}