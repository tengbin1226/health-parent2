package com.health.service;

import com.github.pagehelper.PageInfo;
import com.health.entity.PageResult;
import com.health.vo.MemberVO;
import com.health.vo.MemberQueryVO;

/**
 * 会员管理接口
 */
public interface MemberService {

    /**
     * 分页查询会员信息
     *
     * @return
     */
    PageInfo<MemberQueryVO> queryMembers(Integer currentPage, Integer pageSize, String queryString);

    /**
     * 添加会员信息
     * @param memberVO
     * @return
     */
    Boolean addMember(MemberVO memberVO);

    /**
     * 逻辑删除(修改状态)
     * @param id
     * @return
     */
    Boolean updateMemberStatus(Integer id);

    /**
     *物理删除
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

    /**
     * 修改会员信息
     * @param memberAddVO
     * @return
     */
    Boolean updateMemberInfo(MemberVO memberVO);
}
