package com.health.bean;

import java.util.Date;

public class InterposeFollowupVisit {
    private Integer id;

    private Integer healthMgrId;

    private String interposeName;

    private String filenumber;

    private Date returnTime;

    private Date specificTime;

    private String visitMethod;

    private String returnContent;

    private String feedbackInfo;

    private String handlingResult;

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

    public String getInterposeName() {
        return interposeName;
    }

    public void setInterposeName(String interposeName) {
        this.interposeName = interposeName == null ? null : interposeName.trim();
    }

    public String getFilenumber() {
        return filenumber;
    }

    public void setFilenumber(String filenumber) {
        this.filenumber = filenumber == null ? null : filenumber.trim();
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public Date getSpecificTime() {
        return specificTime;
    }

    public void setSpecificTime(Date specificTime) {
        this.specificTime = specificTime;
    }

    public String getVisitMethod() {
        return visitMethod;
    }

    public void setVisitMethod(String visitMethod) {
        this.visitMethod = visitMethod == null ? null : visitMethod.trim();
    }

    public String getReturnContent() {
        return returnContent;
    }

    public void setReturnContent(String returnContent) {
        this.returnContent = returnContent == null ? null : returnContent.trim();
    }

    public String getFeedbackInfo() {
        return feedbackInfo;
    }

    public void setFeedbackInfo(String feedbackInfo) {
        this.feedbackInfo = feedbackInfo == null ? null : feedbackInfo.trim();
    }

    public String getHandlingResult() {
        return handlingResult;
    }

    public void setHandlingResult(String handlingResult) {
        this.handlingResult = handlingResult == null ? null : handlingResult.trim();
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