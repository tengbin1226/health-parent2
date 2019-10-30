package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserRole extends UserRoleKey implements Serializable {

    private static final long serialVersionUID = -513819123348795494L;

    private Date createTime;

    private Date updateTime;
}