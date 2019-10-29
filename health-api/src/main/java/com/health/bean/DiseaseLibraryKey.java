package com.health.bean;

public class DiseaseLibraryKey {
    private Integer id;

    private String medicalTreatmentPeriod;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMedicalTreatmentPeriod() {
        return medicalTreatmentPeriod;
    }

    public void setMedicalTreatmentPeriod(String medicalTreatmentPeriod) {
        this.medicalTreatmentPeriod = medicalTreatmentPeriod == null ? null : medicalTreatmentPeriod.trim();
    }
}