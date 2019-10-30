package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 健康管理师
 */
@Data
public class HealthMgr implements Serializable {

    private static final long serialVersionUID = 1398332775390066665L;

    private Integer id;

    private Integer healthMgrId;

    private String healthMgrName;

    private Integer status;

    private String remark;

    private Date createTime;

    private Date updateTime;
}