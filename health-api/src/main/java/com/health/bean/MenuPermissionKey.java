package com.health.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class MenuPermissionKey implements Serializable {

    private static final long serialVersionUID = -1566859676614108117L;

    private Integer tMenuId;

    private Integer tPermissionId;
}