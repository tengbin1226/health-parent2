package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 指标管理
 */
@Data
public class InterposeIndicator implements Serializable {

    private static final long serialVersionUID = 1633349094889830159L;

    private Integer id;

    private Integer sequenceNo;

    private String indicatorName;

    private String normalValue;

    private String unit;

    private Float leftCritical;

    private Float rightCritical;

    private String remark;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private String gender;
}