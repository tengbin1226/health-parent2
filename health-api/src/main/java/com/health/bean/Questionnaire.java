package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Questionnaire implements Serializable {

    private static final long serialVersionUID = -5766948121646803819L;

    private Integer id;

    private String name;

    private Integer type;

    private Integer status;

    private Integer gender;

    private Date createTime;

    private Date updateTime;
}