package com.health.bean;

import java.util.Date;

public class MemberDynamicinfo {
    private Integer id;

    private Integer tMemberId;

    private Float height;

    private Float weight;

    private Float dbp;

    private Float sbp;

    private String breth;

    private Float thermometer;

    private Float waistline;

    private Float hipline;

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

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getDbp() {
        return dbp;
    }

    public void setDbp(Float dbp) {
        this.dbp = dbp;
    }

    public Float getSbp() {
        return sbp;
    }

    public void setSbp(Float sbp) {
        this.sbp = sbp;
    }

    public String getBreth() {
        return breth;
    }

    public void setBreth(String breth) {
        this.breth = breth == null ? null : breth.trim();
    }

    public Float getThermometer() {
        return thermometer;
    }

    public void setThermometer(Float thermometer) {
        this.thermometer = thermometer;
    }

    public Float getWaistline() {
        return waistline;
    }

    public void setWaistline(Float waistline) {
        this.waistline = waistline;
    }

    public Float getHipline() {
        return hipline;
    }

    public void setHipline(Float hipline) {
        this.hipline = hipline;
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