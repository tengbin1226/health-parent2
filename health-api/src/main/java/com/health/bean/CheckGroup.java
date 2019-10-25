package com.health.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class CheckGroup implements Serializable {

    private static final long serialVersionUID = 749169920410402961L;

    private Integer id;

    private String code;

    private String name;

    private String helpcode;

    private String sex;

    private String remark;

    private String attention;
}