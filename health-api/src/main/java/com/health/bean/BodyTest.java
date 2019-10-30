package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 体质测试
 */
@Data
public class BodyTest implements Serializable {

    private static final long serialVersionUID = 603116536034139562L;

    private Integer id;

    private String tQuestion;

    private Integer tOptions;

    private Date createTime;

    private Date updateTime;
}