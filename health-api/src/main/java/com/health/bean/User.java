package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = -5693959214803180930L;

    private Integer id;

    private Date birthday;

    private String gender;

    private String username;

    private String password;

    private String remark;

    private String station;

    private String telephone;
}