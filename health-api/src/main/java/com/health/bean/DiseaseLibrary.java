package com.health.bean;

import java.util.Date;

public class DiseaseLibrary extends DiseaseLibraryKey {
    private String code;

    private String name;

    private Integer clinicDepartmentId;

    private String warningLevel;

    private String exceptionTypes;

    private Integer occupationalDisease;

    private Integer gender;

    private String otherName;

    private String medicalInterpretation;

    private String reason;

    private String advise;

    private Date createTime;

    private Date updateTime;

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

    public Integer getClinicDepartmentId() {
        return clinicDepartmentId;
    }

    public void setClinicDepartmentId(Integer clinicDepartmentId) {
        this.clinicDepartmentId = clinicDepartmentId;
    }

    public String getWarningLevel() {
        return warningLevel;
    }

    public void setWarningLevel(String warningLevel) {
        this.warningLevel = warningLevel == null ? null : warningLevel.trim();
    }

    public String getExceptionTypes() {
        return exceptionTypes;
    }

    public void setExceptionTypes(String exceptionTypes) {
        this.exceptionTypes = exceptionTypes == null ? null : exceptionTypes.trim();
    }

    public Integer getOccupationalDisease() {
        return occupationalDisease;
    }

    public void setOccupationalDisease(Integer occupationalDisease) {
        this.occupationalDisease = occupationalDisease;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName == null ? null : otherName.trim();
    }

    public String getMedicalInterpretation() {
        return medicalInterpretation;
    }

    public void setMedicalInterpretation(String medicalInterpretation) {
        this.medicalInterpretation = medicalInterpretation == null ? null : medicalInterpretation.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getAdvise() {
        return advise;
    }

    public void setAdvise(String advise) {
        this.advise = advise == null ? null : advise.trim();
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