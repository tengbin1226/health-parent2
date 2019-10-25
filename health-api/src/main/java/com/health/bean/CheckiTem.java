package com.health.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class CheckiTem implements Serializable {

    private static final long serialVersionUID = 7283287429373158618L;

    private Integer id;

    private String code;

    private String name;

    private String sex;

    private String age;

    private Float price;

    private String type;

    private String attention;

    private String remark;
}