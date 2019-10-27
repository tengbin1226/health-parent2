package com.health.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 健康管理师
 */
@Data
public class HealthMgr implements Serializable {

    private static final long serialVersionUID = -3094580107588628866L;

    private Integer id;

    private Integer healthMgrId;

    private String healthMgrName;

    private Integer state;

    private String remark;
}