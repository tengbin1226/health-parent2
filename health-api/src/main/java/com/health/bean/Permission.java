package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Permission implements Serializable {

    private static final long serialVersionUID = -5086222751954099876L;

    private Integer id;

    private String name;

    private String keyword;

    private String description;

    private Date createTime;

    private Date updateTime;
}