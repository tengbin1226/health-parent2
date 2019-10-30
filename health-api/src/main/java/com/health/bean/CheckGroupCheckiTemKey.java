package com.health.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class CheckGroupCheckiTemKey implements Serializable {

    private static final long serialVersionUID = 4097606740824959666L;

    private Integer checkgroupId;

    private Integer checkitemId;
}