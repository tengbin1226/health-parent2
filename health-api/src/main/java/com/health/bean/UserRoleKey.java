package com.health.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserRoleKey implements Serializable {

    private static final long serialVersionUID = 2913731180321028372L;

    private Integer userId;

    private Integer roleId;
}