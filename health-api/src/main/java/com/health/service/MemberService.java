package com.health.service;

import com.github.pagehelper.PageInfo;
import com.health.bean.Member;
import com.health.vo.MemberVO;

import java.util.List;

/**
 * 会员管理接口
 */
public interface MemberService {

    /**
     * 分页查询会员信息
     * @return
     */
    PageInfo<MemberVO> queryMembers();
}
