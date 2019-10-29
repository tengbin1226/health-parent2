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
 * 分页查询
 */
public class QueryPageBean implements Serializable {

    private static final long serialVersionUID = -8729092596813832067L;
    //页码
    private Integer currentPage;
    //每页记录数
    private Integer pageSize;
    //查询条件
    private String queryString;
}
