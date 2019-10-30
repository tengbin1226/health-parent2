package com.health.bean;

import java.io.Serializable;
import java.util.Date;

public class DiseaseLibrary extends DiseaseLibraryKey implements Serializable {

    private static final long serialVersionUID = 8408562657625956337L;

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
}