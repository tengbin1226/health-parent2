package com.health.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 会员病史
 */
@Data
public class MemberMedicalhistory implements Serializable {

    private static final long serialVersionUID = -2597029812536461451L;

    private Integer id;

    private Integer memberId;

    private String previousHistory;

    private String familyHistory;

    private String allergicHistory;

    private String medicalHistory;

    private String chronicDisease;
}