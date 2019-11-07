package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CheckiTem implements Serializable {

    private static final long serialVersionUID = 7837502330993110385L;

    private Integer id;

    private String code;

    private String name;

    private String mnemonicName;

    private String sex;

    private String age;

    private Float price;

    private String affiliationClassify;

    private String type;

    private String remark;

    private String attention;

    private String status;

    private Date createTime;

    private Date updateTime;
}