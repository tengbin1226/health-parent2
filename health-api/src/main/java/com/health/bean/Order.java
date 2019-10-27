package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 预约
 */
@Data
public class Order implements Serializable {

    private static final long serialVersionUID = -8028443960283523506L;

    private Integer id;

    private Integer memberId;

    private Date orderdate;

    private String ordertype;

    private String orderstatus;

    private Integer setmealId;
}