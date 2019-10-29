package com.health.bean;

import java.util.Date;

public class MentalityTest {
    private Integer id;

    private String tQuestion;

    private Integer tOption;

    private Date createtime;

    private Date updatetime;

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

    public Integer gettOption() {
        return tOption;
    }

    public void settOption(Integer tOption) {
        this.tOption = tOption;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}