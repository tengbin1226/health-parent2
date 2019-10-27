package com.health.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 角色权限关联
 */
@Data
public class RolePermissionKey implements Serializable {

    private static final long serialVersionUID = 5639166194507273477L;

    private Integer roleId;

    private Integer permissionId;
}