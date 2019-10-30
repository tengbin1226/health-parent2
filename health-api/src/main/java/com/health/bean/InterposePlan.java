package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 干预计划
 */
@Data
public class InterposePlan implements Serializable {

    private static final long serialVersionUID = 6841240932842216570L;

    private Integer id;

    private Integer tMemberId;

    private String interposeTime;

    private String interposeShape;

    private String content;

    private Date createTime;

    private Date updateTime;
}