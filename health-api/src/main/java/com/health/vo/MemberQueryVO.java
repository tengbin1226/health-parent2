package com.health.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 会员管理查询vo
 */
@Data
public class MemberQueryVO implements Serializable {

    private static final long serialversionuid = 7670839669649796605l;

    // 主键编号
    private Integer id;

    // 档案号
    private String fileNumber;

    // 姓名
    private String name;

    // 性别
    private String sex;

    // 身份证号码
    private String idcard;

    // 手机号码
    private String phoneNumber;

    // 注册时间
    private Date regtime;

    // 密码
    private String password;

    // 邮件
    private String email;

    // 出生日期
    private Date birthday;

    // 年龄
    private Integer age;

    // 健康管理师
    private String healthMgrName;

    // 备注
    private String remark;

    // 婚姻状态
    private String maritalStatus;

    // 工作
    private String job;

    // 教育程度
    private String educationDegree;

    // 籍贯
    private String nativePlace;

    // 状态
    private Integer status;
}
