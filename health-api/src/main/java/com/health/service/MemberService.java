package com.health.service;

import com.github.pagehelper.PageInfo;
import com.health.bean.Member;
import com.health.vo.MemberAddVO;
import com.health.vo.MemberVO;

/**
 * 会员管理接口
 */
public interface MemberService {

    /**
     * 分页查询会员信息
     *
     * @return
     */
    PageInfo<MemberVO> queryMembers();

    /**
     * 添加会员信息
     * @param memberVO
     * @return
     */
    Boolean addMember(MemberAddVO memberAddVO);

    /**
     * 根据主键编号删除会员基本信息及详细信息
     * @param id
     * @return
     */
    Boolean deleteMemberById(Integer id);

    /**
     * 根据主键编号查询会员基本信息和详细信息
     * @param id
     * @return
     */
    MemberVO findByMemberId(Integer id);
}
