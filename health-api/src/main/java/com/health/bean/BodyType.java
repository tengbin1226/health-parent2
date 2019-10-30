package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 体质类型
 */
@Data
public class BodyType implements Serializable {

    private static final long serialVersionUID = -539336083228530287L;

    private Integer id;

    private Integer tMemberId;

    private Integer tQiAsthenia;

    private Integer tYangQuality;

    private Integer tYinDeficiency;

    private Date createTime;

    private Date updateTime;
}