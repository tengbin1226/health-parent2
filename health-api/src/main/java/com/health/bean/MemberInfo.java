package com.health.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 会员详细信息
 */
@Data
public class MemberInfo implements Serializable {

    private static final long serialVersionUID = 5454629818784291643L;

    private Integer id;

    private Integer memberId;

    private String maritalStatus;

    private String job;

    private String educationDegree;

    private String nativePlace;

    private Integer healthMgrId;

    private Integer state;
}