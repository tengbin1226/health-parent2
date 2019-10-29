package com.health.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

// 生成get,set方法
@Data
// 生成有参构造方法
@AllArgsConstructor
// 生成无参构造方法
@NoArgsConstructor
/**
 * 页面返回结果
 */
public class Result implements Serializable {

    private static final long serialVersionUID = -6639627478791095277L;

    //执行结果，true为执行成功 false为执行失败
    private boolean flag;

    //返回提示信息，主要用于页面提示信息
    private String message;

    //返回数据
    private Object data;
}
