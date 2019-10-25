package com.health.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class Permission implements Serializable {

    private static final long serialVersionUID = 8108204855860229405L;

    private Integer id;

    private String name;

    private String keyword;

    private String description;
}