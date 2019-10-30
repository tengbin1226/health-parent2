package com.health.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class RoleMenuKey implements Serializable {

    private static final long serialVersionUID = -2282617924786654906L;

    private Integer roleId;

    private Integer menuId;
}