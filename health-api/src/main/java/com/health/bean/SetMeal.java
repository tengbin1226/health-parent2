package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SetMeal implements Serializable {

    private static final long serialVersionUID = 8536401253226930537L;

    private Integer id;

    private String name;

    private String code;

    private String helpcode;

    private String sex;

    private Integer maxage;

    private Integer minage;

    private Float price;

    private String remark;

    private String attention;

    private String img;

    private Date createTime;

    private Date updateTine;
}