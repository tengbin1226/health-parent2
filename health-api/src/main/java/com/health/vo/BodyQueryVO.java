package com.health.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 体质测评查询vo
 */
@Data
public class BodyQueryVO implements Serializable {

    private static final long serialVersionUID = -2038044843967981212L;

    private Integer id;

    private Integer tMemberId;

    private String fileNumber;

    private String name;

    private Integer tqiAsthenia;

    private Integer tyangQuality;

    private Integer tyinDeficiency;

    private Date createTime;

    private Date updateTime;

}
