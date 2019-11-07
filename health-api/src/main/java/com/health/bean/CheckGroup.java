package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.Date;

@Data
public class CheckGroup implements Serializable {

    private static final long serialVersionUID = -5870086726921420437L;

    private Integer id;

    private String code;

    private String name;

    private String helpcode;

    private String sex;

    private String remark;

    private String attention;

    private String status;

    private Date createTime;

    private Date updateTime;
}