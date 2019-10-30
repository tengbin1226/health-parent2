package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Role implements Serializable {

    private static final long serialVersionUID = -2573891761543187265L;

    private Integer id;

    private String name;

    private String keyword;

    private String description;

    private Date createTime;

    private Date updateTime;
}