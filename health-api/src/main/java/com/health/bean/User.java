package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {

    private static final long serialVersionUID = -2733129349196015378L;

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

    private Date updateTime;
}