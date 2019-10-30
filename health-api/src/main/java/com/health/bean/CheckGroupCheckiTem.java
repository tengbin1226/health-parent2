package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CheckGroupCheckiTem extends CheckGroupCheckiTemKey implements Serializable {

    private static final long serialVersionUID = -6650700226029867782L;

    private Date createTime;

    private Date updateTime;
}