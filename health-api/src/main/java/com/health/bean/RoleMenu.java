package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class RoleMenu extends RoleMenuKey implements Serializable {

    private static final long serialVersionUID = 5637180112722786761L;

    private Date createtime;

    private Date updatetime;
}