package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ClinicDepartment implements Serializable {

    private static final long serialVersionUID = 4866420414674898428L;

    private Integer id;

    private String name;

    private Date createTime;

    private Date updateTime;
}