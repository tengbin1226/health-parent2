package com.health.bean;

import java.util.Date;

public class BodyType {
    private Integer id;

    private Integer tMemberId;

    private Integer tQiAsthenia;

    private Integer tYangQuality;

    private Integer tYinDeficiency;

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

    public Integer gettQiAsthenia() {
        return tQiAsthenia;
    }

    public void settQiAsthenia(Integer tQiAsthenia) {
        this.tQiAsthenia = tQiAsthenia;
    }

    public Integer gettYangQuality() {
        return tYangQuality;
    }

    public void settYangQuality(Integer tYangQuality) {
        this.tYangQuality = tYangQuality;
    }

    public Integer gettYinDeficiency() {
        return tYinDeficiency;
    }

    public void settYinDeficiency(Integer tYinDeficiency) {
        this.tYinDeficiency = tYinDeficiency;
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