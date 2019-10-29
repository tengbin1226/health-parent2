package com.health.bean;

import java.util.Date;

public class BodyTest {
    private Integer id;

    private String tQuestion;

    private Integer tOptions;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String gettQuestion() {
        return tQuestion;
    }

    public void settQuestion(String tQuestion) {
        this.tQuestion = tQuestion == null ? null : tQuestion.trim();
    }

    public Integer gettOptions() {
        return tOptions;
    }

    public void settOptions(Integer tOptions) {
        this.tOptions = tOptions;
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