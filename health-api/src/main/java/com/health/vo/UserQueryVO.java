package com.health.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 *
 */
@Data
public class UserQueryVO implements Serializable {

    private static final long serialVersionUID = 6897949024020183667L;

    private Integer id;

    private Date birthday;

    private String gender;

    private String username;

    private String fullname;

    private String password;

    private String email;

    private Integer loginnum;

    private String remark;

    private Integer status;

    private String telephone;

    private Date createTime;

    // 角色名称
    private String name;
}