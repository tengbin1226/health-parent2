package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class MemberMedicalHistory implements Serializable {

    private static final long serialVersionUID = 1040639597412164996L;

    private Integer id;

    private Integer tMemberId;

    private String previousHistory;

    private String familyHistory;

    private String allergicHistory;

    private String medicalHistory;

    private String chronicDisease;

    private Date createTime;

    private Date updateTime;
}