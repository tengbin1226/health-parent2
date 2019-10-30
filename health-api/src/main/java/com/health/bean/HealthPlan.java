package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 健康计划
 */
@Data
public class HealthPlan implements Serializable {

    private static final long serialVersionUID = 6384333282936983891L;

    private Integer id;

    private String code;

    private String title;

    private String keywords;

    private Integer typeid;

    private String content;

    private Integer state;

    private String remark;

    private Date createTime;

    private Date updateTime;
}