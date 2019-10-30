package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class MenuPermission extends MenuPermissionKey implements Serializable {

    private static final long serialVersionUID = 6947795011807272321L;

    private Date createtime;

    private Date updatetime;

}