package com.health.bean;

import java.util.Date;

public class HealthMgr {
    private Integer id;

    private Integer healthMgrId;

    private String healthMgrName;

    private Integer status;

    private String remark;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHealthMgrId() {
        return healthMgrId;
    }

    public void setHealthMgrId(Integer healthMgrId) {
        this.healthMgrId = healthMgrId;
    }

    public String getHealthMgrName() {
        return healthMgrName;
    }

    public void setHealthMgrName(String healthMgrName) {
        this.healthMgrName = healthMgrName == null ? null : healthMgrName.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}