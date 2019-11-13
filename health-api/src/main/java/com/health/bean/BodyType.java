package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BodyType implements Serializable {

    private static final long serialVersionUID = 351108093330923732L;

    private Integer id;

    private Integer tMemberId;

    private Integer tQiAsthenia;

    private Integer tYangQuality;

    private Integer tYinDeficiency;

    private String status;

    private Date createTime;

    private Date updateTime;
}