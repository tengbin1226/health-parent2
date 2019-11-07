package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Menu implements Serializable {

    private static final long serialVersionUID = 2723457546263326060L;

    // 主键编号
    private Integer id;

    // 菜单名称
    private String name;

    // 菜单链接
    private String linkurl;

    // 路径
    private String path;

    // 路径
    private Integer priority;

    // 图标
    private String icon;

    // 描述
    private String description;

    // 父菜单编号
    private Integer parentmenuid;

    // 等级
    private Integer level;

    // 状态
    private Integer status;

    private Date createTime;

    private Date updateTime;

    // 子菜单集合
    private List<Menu> children = new ArrayList<>();
}