package com.health.bean;

import java.util.Date;

public class SportsItemLibrary {
    private Integer id;

    private String code;

    private String name;

    private String strength;

    private Integer thousandStepEquivalent;

    private Integer movementTime;

    private Integer minage;

    private Integer maxage;

    private Integer applyToGender;

    private String tensileParts;

    private String actionMethod;

    private String notes;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength == null ? null : strength.trim();
    }

    public Integer getThousandStepEquivalent() {
        return thousandStepEquivalent;
    }

    public void setThousandStepEquivalent(Integer thousandStepEquivalent) {
        this.thousandStepEquivalent = thousandStepEquivalent;
    }

    public Integer getMovementTime() {
        return movementTime;
    }

    public void setMovementTime(Integer movementTime) {
        this.movementTime = movementTime;
    }

    public Integer getMinage() {
        return minage;
    }

    public void setMinage(Integer minage) {
        this.minage = minage;
    }

    public Integer getMaxage() {
        return maxage;
    }

    public void setMaxage(Integer maxage) {
        this.maxage = maxage;
    }

    public Integer getApplyToGender() {
        return applyToGender;
    }

    public void setApplyToGender(Integer applyToGender) {
        this.applyToGender = applyToGender;
    }

    public String getTensileParts() {
        return tensileParts;
    }

    public void setTensileParts(String tensileParts) {
        this.tensileParts = tensileParts == null ? null : tensileParts.trim();
    }

    public String getActionMethod() {
        return actionMethod;
    }

    public void setActionMethod(String actionMethod) {
        this.actionMethod = actionMethod == null ? null : actionMethod.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
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