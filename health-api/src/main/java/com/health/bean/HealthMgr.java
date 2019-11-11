package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class HealthMgr implements Serializable {
    private static final long serialVersionUID = -5354776543591466661L;

    private Integer id;

    private Integer healthMgrId;

    private String healthMgrName;

    private Integer status;

    private String remark;

    private Date createTime;

    private Date updateTime;

}