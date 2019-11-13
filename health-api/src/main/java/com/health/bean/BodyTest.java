package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BodyTest implements Serializable {

    private static final long serialVersionUID = 7128331254795392024L;

    private Integer id;

    private String tQuestion;

    private Integer tOptions;

    private String tBodyType;

    private Date createTime;

    private Date updateTime;
}