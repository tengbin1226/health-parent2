package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 检查组
 */
@Data
public class CheckGroup implements Serializable {

    private static final long serialVersionUID = -1957815206578149998L;

    private Integer id;

    private String code;

    private String name;

    private String helpcode;

    private String sex;

    private String remark;

    private String attention;

    private Date createTime;

    private Date updateTime;
}