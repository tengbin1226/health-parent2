package com.health.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class SetMeal implements Serializable {

    private static final long serialVersionUID = -8819545576263883540L;

    private Integer id;

    private String name;

    private String code;

    private String helpcode;

    private String sex;

    private String age;

    private Float price;

    private String remark;

    private String attention;

    private String img;
}