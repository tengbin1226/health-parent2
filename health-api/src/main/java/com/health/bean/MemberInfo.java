package com.health.bean;

import java.util.Date;

public class MemberInfo {
    private Integer id;

    private Integer tMemberId;

    private Integer maritalStatus;

    private String job;

    private String educationDegree;

    private String nativePlace;

    private Integer healthMgrId;

    private Integer status;

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

    public Integer getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Integer maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(String educationDegree) {
        this.educationDegree = educationDegree == null ? null : educationDegree.trim();
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }

    public Integer getHealthMgrId() {
        return healthMgrId;
    }

    public void setHealthMgrId(Integer healthMgrId) {
        this.healthMgrId = healthMgrId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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