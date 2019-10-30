package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 运动干预
 */
@Data
public class InterposeSprot implements Serializable {

    private static final long serialVersionUID = 2989208426534858034L;

    private Integer id;

    private Integer tMemberId;

    private String sportName;

    private Integer sportTime;

    private String sportCycle;

    private Integer consumeCount;

    private Date createTime;

    private Date updateTime;
}