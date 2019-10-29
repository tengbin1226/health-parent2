package com.health.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

// 生成get,set方法
@Data
// 生成有参构造方法
@AllArgsConstructor
// 生成无参构造方法
@NoArgsConstructor
/**
 *  分页数据结果
 */
public class PageResult<T> implements Serializable {

    private static final long serialVersionUID = -9062997322260325784L;
    //总记录数
    private Long total;

    //当前页结果
    private List rows;

}
