package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 饮食干预
 */
@Data
public class InterposeFood implements Serializable {

    private static final long serialVersionUID = 2929604345853929203L;

    private Integer id;

    private Integer tMemberId;

    private Integer eatTimes;

    private String recommendFood;

    private Float foodQuantity;

    private Float adi;

    private Date createTime;

    private Date updateTime;
}