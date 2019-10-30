package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Evaluate implements Serializable {

    private static final long serialVersionUID = 7106965616586173139L;

    private Integer id;

    private String name;

    private String result;

    private String advise;

    private Integer state;

    private String remark;

    private String group;

    private Integer disAdvise;

    private Date createTime;

    private Date updateTime;
}