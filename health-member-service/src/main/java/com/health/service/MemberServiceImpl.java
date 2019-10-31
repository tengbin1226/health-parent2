package com.health.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.health.bean.*;
import com.health.entity.PageResult;
import com.health.mapper.*;
import com.health.vo.MemberQueryVO;
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
    private MemberDynamicInfoMapper MemberDynamicInfoMapper;

    // 会员病史信息
    @Autowired
    private MemberMedicalHistoryMapper MemberMedicalHistoryMapper;

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
    public PageInfo<MemberQueryVO> queryMembers(Integer currentPage, Integer pageSize, String queryString) {
        //拼接模糊查询的%
        if ("无".equals(queryString) || "".equals(queryString) || StringUtils.isBlank(queryString)) {
            queryString =null;
        }else {
            queryString="%"+queryString+"%";
        }
        // 初始化分页对象
        PageInfo<MemberQueryVO> pageInfo = null;

        //使用pageHelper插件
        PageHelper.startPage(currentPage, pageSize);

        // 获取查询结果集
        List<MemberQueryVO> list = memberMapper.queryMemberInfo(queryString);

        pageInfo = new PageInfo<>(list);

        //返回自定义分页查询结果
        return pageInfo;
    }

    /**
     * 添加会员信息
     *
     * @param memberVO
     * @return
     */
    @Override
    public Boolean addMember(MemberVO memberVO) {
        if (ObjectUtils.isEmpty(memberVO)) {
            return false;
        }
        // 获取会员基本信息对象
        Member member = memberVO.getMember();
        // 获取会员详细信息对象
        MemberInfo memberinfo = memberVO.getMemberInfo();
        // 获取会员动态信息对象
        MemberDynamicInfo MemberDynamicInfo = memberVO.getMemberDynamicInfo();
        // 获取会员病史信息对象
        MemberMedicalHistory MemberMedicalHistory = memberVO.getMemberMedicalHistory();

        // 添加会员基本信息
        int i = memberMapper.insertSelective(member);
        // 添加会员详细信息
        int i1 = memberInfoMapper.insertSelective(memberinfo);
        // 添加会员动态信息
        int i2 = MemberDynamicInfoMapper.insertSelective(MemberDynamicInfo);
        // 添加会员病史信息
        int i3 = MemberMedicalHistoryMapper.insertSelective(MemberMedicalHistory);

        return i > 0;
    }

    /**
     * 逻辑删除(修改状态)
     *
     * @param id
     * @return
     */
    @Override
    public Boolean updateMemberStatus(Integer id) {

        // 根据主键编号查询会员信息
        Member member = memberMapper.selectByPrimaryKey(id);
        // 设置属性,即修改会员状态属性值
        member.setStatus(1);

        int i = memberMapper.updateByPrimaryKey(member);

        return i > 0;
    }

    /**
     * 物理删除
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
        MemberDynamicInfoExample MemberDynamicInfoExample = new MemberDynamicInfoExample();
        MemberDynamicInfoExample.Criteria criteria1 = MemberDynamicInfoExample.createCriteria();
        criteria1.andTMemberIdEqualTo(id);
        int i2 = MemberDynamicInfoMapper.deleteByExample(MemberDynamicInfoExample);

        // 删除会员病史信息
        MemberMedicalHistoryExample MemberMedicalHistoryExample = new MemberMedicalHistoryExample();
        MemberMedicalHistoryExample.Criteria criteria2 = MemberMedicalHistoryExample.createCriteria();
        criteria2.andTMemberIdEqualTo(id);
        int i3 = MemberMedicalHistoryMapper.deleteByExample(MemberMedicalHistoryExample);

        //删除会员详细信息
        MemberInfoExample example = new MemberInfoExample();
        MemberInfoExample.Criteria criteria = example.createCriteria();
        criteria.andTMemberIdEqualTo(id);
        int i = memberInfoMapper.deleteByExample(example);
        // 删除会员基本信息
        int i1 = memberMapper.deleteByPrimaryKey(id);

        return i1 > 0;
    }

    /**
     * 根据主键编号查询会员基本信息,详细信息,动态信息,病史信息
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
        criteria.andTMemberIdEqualTo(id);
        List<MemberInfo> memberInfos = memberInfoMapper.selectByExample(example);
        MemberInfo memberInfo = memberInfos.get(0);

        // 根据健康管理师编号查询健康管理师信息
        Integer healthMgrId = memberInfo.getHealthMgrId();
        HealthMgrExample healthMgrExample = new HealthMgrExample();
        HealthMgrExample.Criteria criteria1 = healthMgrExample.createCriteria();
        criteria1.andHealthMgrIdEqualTo(healthMgrId);
        List<HealthMgr> healthMgrs = healthMgrMapper.selectByExample(healthMgrExample);
        HealthMgr healthMgr = healthMgrs.get(0);

        // 查询会员动态信息
        MemberDynamicInfoExample example1 = new MemberDynamicInfoExample();
        MemberDynamicInfoExample.Criteria criteria2 = example1.createCriteria();
        criteria2.andTMemberIdEqualTo(id);
        List<MemberDynamicInfo> MemberDynamicInfos = MemberDynamicInfoMapper.selectByExample(example1);
        MemberDynamicInfo MemberDynamicInfo = MemberDynamicInfos.get(0);


        // 查询会员病史信息
        MemberMedicalHistoryExample example2 = new MemberMedicalHistoryExample();
        MemberMedicalHistoryExample.Criteria criteria3 = example2.createCriteria();
        criteria3.andTMemberIdEqualTo(id);
        List<MemberMedicalHistory> memberMedicalhistories = MemberMedicalHistoryMapper.selectByExample(example2);
        MemberMedicalHistory MemberMedicalHistory = memberMedicalhistories.get(0);

        // 实例化vo对象
        MemberVO memberVO = new MemberVO();
        // 设置属性
        memberVO.setMember(member);
        memberVO.setMemberInfo(memberInfo);
        memberVO.setMemberDynamicInfo(MemberDynamicInfo);
        memberVO.setMemberMedicalHistory(MemberMedicalHistory);
        return memberVO;
    }

    /**
     * 修改会员信息
     *
     * @param memberVO
     * @return
     */
    @Override
    public Boolean updateMemberInfo(MemberVO memberVO) {
        // 获取会员基本信息对象
        Member member = memberVO.getMember();
        // 获取会员详细信息对象
        MemberInfo memberinfo = memberVO.getMemberInfo();
        // 获取会员动态信息对象
        MemberDynamicInfo MemberDynamicInfo = memberVO.getMemberDynamicInfo();
        // 获取会员病史信息对象
        MemberMedicalHistory MemberMedicalHistory = memberVO.getMemberMedicalHistory();

        // 修改会员基本信息
        int i = memberMapper.updateByPrimaryKeySelective(member);
        // 会员详细信息
        MemberInfoExample memberInfoExample = new MemberInfoExample();
        MemberInfoExample.Criteria criteria = memberInfoExample.createCriteria();
        criteria.andTMemberIdEqualTo(member.getId());
        int i1 = memberInfoMapper.updateByExampleSelective(memberinfo, memberInfoExample);
        // 修改会员动态信息
        MemberDynamicInfoExample dynamicinfoExample = new MemberDynamicInfoExample();
        MemberDynamicInfoExample.Criteria criteria1 = dynamicinfoExample.createCriteria();
        criteria1.andTMemberIdEqualTo(member.getId());
        int i2 = MemberDynamicInfoMapper.updateByExampleSelective(MemberDynamicInfo, dynamicinfoExample);

        // 修改会员病史信息
        MemberMedicalHistoryExample medicalhistoryExample = new MemberMedicalHistoryExample();
        MemberMedicalHistoryExample.Criteria criteria2 = medicalhistoryExample.createCriteria();
        criteria2.andTMemberIdEqualTo(member.getId());
        int i3 = MemberMedicalHistoryMapper.updateByExampleSelective(MemberMedicalHistory, medicalhistoryExample);

        return i3 > 0;
    }
}