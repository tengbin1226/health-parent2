package com.health.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 心理测评查询vo
 */
@Data
public class MentalityQueryVO implements Serializable {

    private static final long serialVersionUID = 6801457697769431540L;

    private Integer id;

    private Integer tMemberId;

    private String fileNumber;

    private String name;

    private Integer tOcd;

    private Integer tAnxiety;

    private Integer tTerror;

    private String status;

    private Date createtime;

}
