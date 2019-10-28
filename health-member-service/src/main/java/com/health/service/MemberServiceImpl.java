package com.health.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.health.bean.Member;
import com.health.context.SystemContext;
import com.health.mapper.MemberMapper;
import com.health.vo.MemberVO;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 会员管理接口实现类
 */
@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    private MemberMapper memberMapper;

    /**
     * 分页查询会员信息
     * @return
     */
    @Override
    public PageInfo<MemberVO> queryMembers() {
        //初始化分页对象
        PageInfo<MemberVO> pageInfo = null;

        //创建分页帮助对象
        PageHelper.startPage(SystemContext.getPageNum(), SystemContext.getPageSize());

        List<MemberVO> factories = memberMapper.queryMemberInfo();

        //根据返回的查询结果集实例化分页对象
        pageInfo = new PageInfo<>(factories);

        return pageInfo;
    }
}
