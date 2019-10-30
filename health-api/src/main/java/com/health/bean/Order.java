package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class    Order implements Serializable {

    private static final long serialVersionUID = -328243276139469560L;

    private Integer id;

    private Integer memberId;

    private Date orderdate;

    private String ordertype;

    private String orderstatus;

    private Integer setmealId;

    private Date createTime;

    private Date updateTime;
}