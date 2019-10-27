package com.health.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 检查分类和检查项关联类
 */
@Data
public class CheckGroupCheckiTemKey implements Serializable {

    private static final long serialVersionUID = -3573272917359036759L;

    private Integer checkgroupId;

    private Integer checkitemId;
}