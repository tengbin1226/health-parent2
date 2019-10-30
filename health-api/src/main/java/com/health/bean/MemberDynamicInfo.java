package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class MemberDynamicInfo implements Serializable {

    private static final long serialVersionUID = -1966268403878371324L;

    private Integer id;

    private Integer tMemberId;

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

    private Date createTime;

    private Date updateTime;
}