package com.health.bean;

import java.util.Date;

public class InterposeFood {
    private Integer id;

    private Integer tMemberId;

    private Integer eatTimes;

    private String recommendFood;

    private Float foodQuantity;

    private Float adi;

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

    public Integer getEatTimes() {
        return eatTimes;
    }

    public void setEatTimes(Integer eatTimes) {
        this.eatTimes = eatTimes;
    }

    public String getRecommendFood() {
        return recommendFood;
    }

    public void setRecommendFood(String recommendFood) {
        this.recommendFood = recommendFood == null ? null : recommendFood.trim();
    }

    public Float getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(Float foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public Float getAdi() {
        return adi;
    }

    public void setAdi(Float adi) {
        this.adi = adi;
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