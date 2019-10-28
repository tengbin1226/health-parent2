package com.health.vo;

import com.health.bean.HealthMgr;
import com.health.bean.Member;
import com.health.bean.MemberInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 会员管理查询vo
 */
@Data
public class MemberVO implements Serializable {

    private static final long serialversionuid = 7670839669649796605l;

    private Member member;

    private MemberInfo memberinfo;

    private Integer age;

    private String healthMgrName;
}
