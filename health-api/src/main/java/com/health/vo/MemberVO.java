package com.health.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 会员添加vo类
 */
@Data
public class MemberVO implements Serializable {

    private static final long serialVersionUID = -4889653619790866170L;

    // 基本信息
    private Integer id;

    private String filenumber;

    private String name;

    private String sex;

    private String idcard;

    private String phonenumber;

    private Date regtime;

    private String password;

    private String email;

    private Date birthday;

    private String remark;

    private Date createTime;

    private Date updateTime;

    private Integer status;

    // 详细信息
    private Integer maritalStatus;

    private String job;

    private String educationDegree;

    private String nativePlace;

    private Integer healthMgrId;

    private String healthMgrName;

    // 会员动态信息
    private Float height;

    private Float weight;

    private Float dbp;

    private Float sbp;

    private String breth;

    private Float thermometer;

    private Float waistline;

    private Float hipline;

    private Integer bmi;

    private Float spo;

    // 会员病史
    private String previousHistory;

    private String familyHistory;

    private String allergicHistory;

    private String medicalHistory;

    private String chronicDisease;
}
