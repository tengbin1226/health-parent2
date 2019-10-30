package com.health.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class DiseaseLibraryKey implements Serializable {

    private static final long serialVersionUID = 7792968698968707414L;

    private Integer id;

    private String medicalTreatmentPeriod;
}