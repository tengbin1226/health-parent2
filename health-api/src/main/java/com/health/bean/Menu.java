package com.health.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 菜单
 */
@Data
public class Menu implements Serializable {

    private static final long serialVersionUID = -1406866952167503971L;

    private Integer id;

    private String name;

    private String linkurl;

    private String path;

    private Integer priority;

    private String icon;

    private String description;

    private Integer parentmenuid;

    private Integer level;
}