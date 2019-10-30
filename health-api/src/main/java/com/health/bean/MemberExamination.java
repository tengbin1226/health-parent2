package com.health.bean;

import java.io.Serializable;
import java.util.Date;

public class MemberExamination implements Serializable {

    private static final long serialVersionUID = 8194648329274356713L;

    private Integer id;

    private Integer tSetmealId;

    private Integer tMemberId;

    private Date examDate;

    private Integer reportStatus;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer gettSetmealId() {
        return tSetmealId;
    }

    public void settSetmealId(Integer tSetmealId) {
        this.tSetmealId = tSetmealId;
    }

    public Integer gettMemberId() {
        return tMemberId;
    }

    public void settMemberId(Integer tMemberId) {
        this.tMemberId = tMemberId;
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    public Integer getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(Integer reportStatus) {
        this.reportStatus = reportStatus;
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