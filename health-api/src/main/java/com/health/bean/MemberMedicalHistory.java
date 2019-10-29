package com.health.bean;

import java.util.Date;

public class MemberMedicalHistory {
    private Integer id;

    private Integer tMemberId;

    private String previousHistory;

    private String familyHistory;

    private String allergicHistory;

    private String medicalHistory;

    private String chronicDisease;

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

    public String getPreviousHistory() {
        return previousHistory;
    }

    public void setPreviousHistory(String previousHistory) {
        this.previousHistory = previousHistory == null ? null : previousHistory.trim();
    }

    public String getFamilyHistory() {
        return familyHistory;
    }

    public void setFamilyHistory(String familyHistory) {
        this.familyHistory = familyHistory == null ? null : familyHistory.trim();
    }

    public String getAllergicHistory() {
        return allergicHistory;
    }

    public void setAllergicHistory(String allergicHistory) {
        this.allergicHistory = allergicHistory == null ? null : allergicHistory.trim();
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory == null ? null : medicalHistory.trim();
    }

    public String getChronicDisease() {
        return chronicDisease;
    }

    public void setChronicDisease(String chronicDisease) {
        this.chronicDisease = chronicDisease == null ? null : chronicDisease.trim();
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