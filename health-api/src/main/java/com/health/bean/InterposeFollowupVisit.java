package com.health.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 随访
 */
@Data
public class InterposeFollowupVisit implements Serializable {

    private static final long serialVersionUID = -7914007690234386273L;

    private Integer id;

    private Integer healthMgrId;

    private String interposeName;

    private String filenumber;

    private Date returnTime;

    private Date specificTime;

    private String visitMethod;

    private String returnContent;

    private String feedbackInfo;

    private String handlingResult;

    private Date createTime;

    private Date updateTime;
}