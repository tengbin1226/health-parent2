package com.health.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.health.bean.*;
import com.health.entity.PageResult;
import com.health.mapper.*;
import com.health.vo.MemberAddVO;
import com.health.vo.MemberVO;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;

import java.util.List;

/**
 * 会员管理接口实现类
 */
@Service
public class MemberServiceImpl implements MemberService {

    // 会员基本信息
    @Autowired
    private MemberMapper memberMapper;

    //会员详细信息
    @Autowired
    private MemberInfoMapper memberInfoMapper;

    // 会员动态信息
    @Autowired
    private MemberDynamicinfoMapper memberDynamicinfoMapper;

    // 会员病史信息
    @Autowired
    private MemberMedicalhistoryMapper memberMedicalhistoryMapper;

    // 健康管理师
    @Autowired
    private HealthMgrMapper healthMgrMapper;

    /**
     * 分页查询会员信息
     *
     * @param currentPage
     * @param pageSize
     * @param queryString
     * @return
     */
    @Override
    public PageResult<MemberVO> queryMembers(Integer currentPage, Integer pageSize, String queryString) {
        //拼接模糊查询的%
        if(!StringUtils.isEmpty(queryString)){
            queryString = "%" + queryString + "%";
        }
        //使用pageHelper插件
        PageHelper.startPage(currentPage, pageSize);
        //调用startPage方法后的下一个select方法会执行分页
        Page<MemberVO> page = memberMapper.queryMemberInfo(queryString);

        PageResult<MemberVO> pageResult=new PageResult(page.getTotal(), page.getResult());

        //返回自定义分页查询结果
        return pageResult;
    }

    /**
     * 添加会员信息
     *
     * @param memberVO
     * @return
     */
    @Override
    public Boolean addMember(MemberAddVO memberAddVO) {
        if (ObjectUtils.isEmpty(memberAddVO)) {
            return false;
        }
        // 获取会员基本信息对象
        Member member = memberAddVO.getMember();
        // 获取会员详细信息对象
        MemberInfo memberinfo = memberAddVO.getMemberInfo();
        // 获取会员动态信息对象
        MemberDynamicinfo memberDynamicinfo = memberAddVO.getMemberDynamicinfo();
        // 获取会员病史信息对象
        MemberMedicalhistory memberMedicalhistory = memberAddVO.getMemberMedicalhistory();

        // 添加会员基本信息
        int i = memberMapper.insertSelective(member);
        // 添加会员详细信息
        int i1 = memberInfoMapper.insertSelective(memberinfo);
        // 添加会员动态信息
        int i2 = memberDynamicinfoMapper.insertSelective(memberDynamicinfo);
        // 添加会员病史信息
        int i3 = memberMedicalhistoryMapper.insertSelective(memberMedicalhistory);

        return i > 0;
    }

    /**
     * 根据主键编号删除会员基本信息及详细信息
     *
     * @param id
     * @return
     */
    @Override
    public Boolean deleteMemberById(Integer id) {
        if (ObjectUtils.isEmpty(id)) {
            return false;
        }
        // 删除会员动态信息
        MemberDynamicinfoExample memberDynamicinfoExample = new MemberDynamicinfoExample();
        MemberDynamicinfoExample.Criteria criteria1 = memberDynamicinfoExample.createCriteria();
        criteria1.andMemberIdEqualTo(id);
        int i2 = memberDynamicinfoMapper.deleteByExample(memberDynamicinfoExample);

        // 删除会员病史信息
        MemberMedicalhistoryExample memberMedicalhistoryExample = new MemberMedicalhistoryExample();
        MemberMedicalhistoryExample.Criteria criteria2 = memberMedicalhistoryExample.createCriteria();
        criteria2.andMemberIdEqualTo(id);
        int i3 = memberMedicalhistoryMapper.deleteByExample(memberMedicalhistoryExample);

        //删除会员详细信息
        MemberInfoExample example = new MemberInfoExample();
        MemberInfoExample.Criteria criteria = example.createCriteria();
        criteria.andMemberIdEqualTo(id);
        int i = memberInfoMapper.deleteByExample(example);
        // 删除会员基本信息
        int i1 = memberMapper.deleteByPrimaryKey(id);

        return i1 > 0;
    }

    /**
     * 根据主键编号查询会员基本信息和详细信息
     *
     * @param id
     * @return
     */
    @Override
    public MemberVO findByMemberId(Integer id) {
        if (ObjectUtils.isEmpty(id)) {
            return null;
        }
        // 查询会员基本信息
        Member member = memberMapper.selectByPrimaryKey(id);

        // 查询会员详细信息
        MemberInfoExample example = new MemberInfoExample();
        MemberInfoExample.Criteria criteria = example.createCriteria();
        criteria.andMemberIdEqualTo(id);
        List<MemberInfo> memberInfos = memberInfoMapper.selectByExample(example);
        MemberInfo memberInfo = memberInfos.get(0);

        // 根据健康管理师编号查询健康管理师信息
        Integer healthMgrId = memberInfo.getHealthMgrId();
        HealthMgrExample healthMgrExample = new HealthMgrExample();
        HealthMgrExample.Criteria criteria1 = healthMgrExample.createCriteria();
        criteria1.andHealthMgrIdEqualTo(healthMgrId);
        List<HealthMgr> healthMgrs = healthMgrMapper.selectByExample(healthMgrExample);
        HealthMgr healthMgr = healthMgrs.get(0);

        // 实例化vo对象
        MemberVO memberVO = new MemberVO();
        // 设置属性值
        memberVO.setMember(member);
        memberVO.setMemberinfo(memberInfo);
        memberVO.setHealthMgrName(healthMgr.getHealthMgrName());

        return memberVO;
    }

    /**
     * 修改会员信息
     *
     * @param memberAddVO
     * @return
     */
    @Override
    public Boolean updateMemberInfo(MemberAddVO memberAddVO) {
        // 获取会员基本信息对象
        Member member = memberAddVO.getMember();
        // 获取会员详细信息对象
        MemberInfo memberinfo = memberAddVO.getMemberInfo();
        // 获取会员动态信息对象
        MemberDynamicinfo memberDynamicinfo = memberAddVO.getMemberDynamicinfo();
        // 获取会员病史信息对象
        MemberMedicalhistory memberMedicalhistory = memberAddVO.getMemberMedicalhistory();

        // 修改会员基本信息
        int i = memberMapper.updateByPrimaryKeySelective(member);
        // 会员详细信息
        MemberInfoExample memberInfoExample = new MemberInfoExample();
        MemberInfoExample.Criteria criteria = memberInfoExample.createCriteria();
        criteria.andMemberIdEqualTo(member.getId());
        int i1 = memberInfoMapper.updateByExampleSelective(memberinfo, memberInfoExample);
        // 修改会员动态信息
        MemberDynamicinfoExample dynamicinfoExample = new MemberDynamicinfoExample();
        MemberDynamicinfoExample.Criteria criteria1 = dynamicinfoExample.createCriteria();
        criteria1.andMemberIdEqualTo(member.getId());
        int i2 = memberDynamicinfoMapper.updateByExampleSelective(memberDynamicinfo, dynamicinfoExample);

        // 修改会员病史信息
        MemberMedicalhistoryExample medicalhistoryExample = new MemberMedicalhistoryExample();
        MemberMedicalhistoryExample.Criteria criteria2 = medicalhistoryExample.createCriteria();
        criteria2.andMemberIdEqualTo(member.getId());
        int i3 = memberMedicalhistoryMapper.updateByExampleSelective(memberMedicalhistory, medicalhistoryExample);

        return i3 > 0;
    }
}