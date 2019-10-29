package com.health.bean;

import java.util.Date;

public class InterposePlan {
    private Integer id;

    private Integer tMemberId;

    private String interposeTime;

    private String interposeShape;

    private String content;

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

    public String getInterposeTime() {
        return interposeTime;
    }

    public void setInterposeTime(String interposeTime) {
        this.interposeTime = interposeTime == null ? null : interposeTime.trim();
    }

    public String getInterposeShape() {
        return interposeShape;
    }

    public void setInterposeShape(String interposeShape) {
        this.interposeShape = interposeShape == null ? null : interposeShape.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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