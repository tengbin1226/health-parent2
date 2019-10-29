package com.health.bean;

import java.util.Date;

public class InterposeIndicator {
    private Integer id;

    private Integer sequenceNo;

    private String indicatorName;

    private String normalValue;

    private String unit;

    private Float leftCritical;

    private Float rightCritical;

    private String remark;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public String getIndicatorName() {
        return indicatorName;
    }

    public void setIndicatorName(String indicatorName) {
        this.indicatorName = indicatorName == null ? null : indicatorName.trim();
    }

    public String getNormalValue() {
        return normalValue;
    }

    public void setNormalValue(String normalValue) {
        this.normalValue = normalValue == null ? null : normalValue.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Float getLeftCritical() {
        return leftCritical;
    }

    public void setLeftCritical(Float leftCritical) {
        this.leftCritical = leftCritical;
    }

    public Float getRightCritical() {
        return rightCritical;
    }

    public void setRightCritical(Float rightCritical) {
        this.rightCritical = rightCritical;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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