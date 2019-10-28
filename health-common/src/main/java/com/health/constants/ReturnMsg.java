package com.health.constants;

import lombok.Data;

import java.io.Serializable;

/**
 * 返回信息
 */
@Data
public class ReturnMsg implements Serializable {

    private static final long serialVersionUID = -3601323091882931555L;

    private String messgae;

    private Boolean flag;

}
