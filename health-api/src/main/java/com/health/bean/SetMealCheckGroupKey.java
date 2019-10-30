package com.health.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class SetMealCheckGroupKey implements Serializable {

    private static final long serialVersionUID = -2020873590094596110L;

    private Integer setmealId;

    private Integer checkgroupId;

    public Integer getSetmealId() {
        return setmealId;
    }

    public void setSetmealId(Integer setmealId) {
        this.setmealId = setmealId;
    }

    public Integer getCheckgroupId() {
        return checkgroupId;
    }

    public void setCheckgroupId(Integer checkgroupId) {
        this.checkgroupId = checkgroupId;
    }
}