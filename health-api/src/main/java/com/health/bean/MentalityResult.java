package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class MentalityResult implements Serializable {

    private static final long serialVersionUID = -3471822441243644071L;

    private Integer id;

    private Integer tMemberId;

    private Integer tOcd;

    private Integer tAnxiety;

    private String status;

    private Integer tTerror;

    private Date createtime;

    private Date updatetime;
}