package com.health.bean;

import java.util.Date;

public class InterposeClassify {
    private Integer id;

    private Integer tMemberId;

    private Integer status;

    private String peopleClassify;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPeopleClassify() {
        return peopleClassify;
    }

    public void setPeopleClassify(String peopleClassify) {
        this.peopleClassify = peopleClassify == null ? null : peopleClassify.trim();
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