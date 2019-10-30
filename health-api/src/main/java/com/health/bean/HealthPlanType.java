package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 健康计划类型
 */
@Data
public class HealthPlanType implements Serializable {

    private static final long serialVersionUID = 5167413807857288503L;

    private Integer id;

    private String name;

    private Date createTime;

    private Date updateTime;
}