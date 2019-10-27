package com.health.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 会员动态信息
 */
@Data
public class MemberDynamicinfo implements Serializable {

    private static final long serialVersionUID = 5766714857044735533L;

    private Integer id;

    private Integer memberId;

    private Float height;

    private Float weight;

    private Float dbp;

    private Float sbp;

    private String breth;

    private Float thermometer;

    private Float waistline;

    private Float hipline;

    private Float bmi;

    private Float oxyhemoglobin;
}