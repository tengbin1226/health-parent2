package com.health.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 角色
 */
@Data
public class Role implements Serializable {

    private static final long serialVersionUID = -4440220932131864048L;

    private Integer id;

    private String name;

    private String keyword;

    private String description;
}