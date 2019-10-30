package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 人群分类
 */
@Data
public class InterposeClassify implements Serializable {

    private static final long serialVersionUID = 7600604468384932308L;

    private Integer id;

    private Integer tMemberId;

    private Integer status;

    private String peopleClassify;

    private Date createTime;

    private Date updateTime;
}