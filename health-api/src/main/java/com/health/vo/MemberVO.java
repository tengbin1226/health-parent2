package com.health.vo;

import com.health.bean.Member;
import com.health.bean.MemberDynamicinfo;
import com.health.bean.MemberInfo;
import com.health.bean.MemberMedicalHistory;
import lombok.Data;

import java.io.Serializable;

/**
 * 会员添加vo类
 */
@Data
public class MemberVO implements Serializable {

    private static final long serialVersionUID = -4889653619790866170L;

    // 基本信息
    private Member member;

    // 详细信息
    private MemberInfo memberInfo;

    // 会员动态信息
    private MemberDynamicinfo memberDynamicinfo;

    // 会员病史
    private MemberMedicalHistory MemberMedicalHistory;
}
