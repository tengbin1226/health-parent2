package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class MemberInfo implements Serializable {

    private static final long serialVersionUID = 3340350911915000197L;

    private Integer id;

    private Integer tMemberId;

    private Integer maritalStatus;

    private String job;

    private String educationDegree;

    private String nativePlace;

    private Integer healthMgrId;

    private Date createTime;

    private Date updateTime;
}