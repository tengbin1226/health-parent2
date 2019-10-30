package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 干预方案
 */
@Data
public class InterposeScheme implements Serializable {

    private static final long serialVersionUID = -7827317513536357672L;

    private Integer id;

    private Integer tMemberId;

    private String schemeTittle;

    private Integer modelId;

    private Date startTime;

    private Date endTime;

    private String schemeTarget;

    private Integer healthMgrId;

    private Date createTime;

    private Date updateTime;
}