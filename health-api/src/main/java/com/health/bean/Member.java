package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Member implements Serializable{

    private static final long serialVersionUID = 308937772179120125L;

    private Integer id;

    private String filenumber;

    private String name;

    private String sex;

    private String idcard;

    private String phonenumber;

    private Date regtime;

    private String password;

    private String email;

    private Date birthday;

    private String remark;
}