package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SetMealCheckGroup extends SetMealCheckGroupKey implements Serializable {

    private static final long serialVersionUID = -4507612744265124177L;

    private Date createTime;

    private Date updateTime;
}