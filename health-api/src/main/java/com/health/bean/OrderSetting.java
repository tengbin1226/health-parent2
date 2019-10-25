package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class OrderSetting implements Serializable {

    private static final long serialVersionUID = 4640969054513750152L;

    private Integer id;

    private Date orderdate;

    private Integer number;

    private Integer reservations;
}