package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class QuestionBank implements Serializable {

    private static final long serialVersionUID = 2596691103114248061L;

    private Integer id;

    private String name;

    private Integer type;

    private Integer gender;

    private Integer required;

    private Date createtime;

    private Date updatetime;
}