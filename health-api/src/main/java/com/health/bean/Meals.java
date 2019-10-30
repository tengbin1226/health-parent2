package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Meals implements Serializable {

    private static final long serialVersionUID = 5702070515681062346L;

    private Integer id;

    private String code;

    private String name;

    private String typeid;

    private Integer energy;

    private Integer protein;

    private Integer fat;

    private Integer carbohydrate;

    private Integer kcal;

    private Integer kj;

    private Integer hbp;

    private Integer diabetes;

    private Integer chd;

    private Integer stroke;

    private Integer cacd;

    private Integer hyperlipidemia;

    private Integer obesity;

    private Integer ventilate;

    private String explain;

    private Date createTime;

    private Date updateTime;
}