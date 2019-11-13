package com.health.service;

import com.github.pagehelper.PageInfo;
import com.health.bean.HealthMgr;
import com.health.entity.PageResult;
import com.health.vo.MemberVO;
import com.health.vo.MemberQueryVO;

import java.util.List;

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

    /**
     * 查询所有健康管理师信息
     * @return
     */
    List<HealthMgr> queryHealthMgrs();

    /**
     * 根据月份计算会员的注册数量
     * @param s
     * @return
     */
    Integer countMemberByMonth(String date);
}
