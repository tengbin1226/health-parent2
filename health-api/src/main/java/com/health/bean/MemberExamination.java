package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 会员体检
 */
@Data
public class MemberExamination implements Serializable {

    private static final long serialVersionUID = 358690094208016550L;

    private Integer id;

    private Integer memberId;

    private Date examDate;

    private Integer setmealId;

    private Integer reportState;
}