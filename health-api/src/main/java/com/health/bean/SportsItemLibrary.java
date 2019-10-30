package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SportsItemLibrary implements Serializable {

    private static final long serialVersionUID = 6817677868362790502L;

    private Integer id;

    private String code;

    private String name;

    private String strength;

    private Integer thousandStepEquivalent;

    private Integer movementTime;

    private Integer minage;

    private Integer maxage;

    private Integer applyToGender;

    private String tensileParts;

    private String actionMethod;

    private String notes;

    private Date createTime;

    private Date updateTime;
}