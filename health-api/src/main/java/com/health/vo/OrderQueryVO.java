package com.health.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 预约查询vo
 */
@Data
public class OrderQueryVO implements Serializable {

    private static final long serialVersionUID = 7792782121950585472L;

    private Integer id;

    private Date orderdate;

    private Integer memberId;

    private String filenumber;

    private String name;

    private String phonenumber;

    private String ordertype;

    private String orderstatus;

}
