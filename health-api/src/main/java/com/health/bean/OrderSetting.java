package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class OrderSetting implements Serializable {

    private static final long serialVersionUID = 7977907596490621156L;

    private Integer id;

    private Date orderdate;

    private Integer number;

    private Integer reservations;

    private Date createTime;

    private Date updateTime;
}