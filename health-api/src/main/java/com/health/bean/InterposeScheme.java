package com.health.bean;

import java.util.Date;

public class InterposeScheme {
    private Integer id;

    private Integer tMemberId;

    private String schemeTittle;

    private Integer modelId;

    private Date startTime;

    private Date endTime;

    private String schemeTarget;

    private Integer healthMgrId;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer gettMemberId() {
        return tMemberId;
    }

    public void settMemberId(Integer tMemberId) {
        this.tMemberId = tMemberId;
    }

    public String getSchemeTittle() {
        return schemeTittle;
    }

    public void setSchemeTittle(String schemeTittle) {
        this.schemeTittle = schemeTittle == null ? null : schemeTittle.trim();
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getSchemeTarget() {
        return schemeTarget;
    }

    public void setSchemeTarget(String schemeTarget) {
        this.schemeTarget = schemeTarget == null ? null : schemeTarget.trim();
    }

    public Integer getHealthMgrId() {
        return healthMgrId;
    }

    public void setHealthMgrId(Integer healthMgrId) {
        this.healthMgrId = healthMgrId;
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