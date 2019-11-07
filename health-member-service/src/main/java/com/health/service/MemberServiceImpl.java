package com.health.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.health.bean.*;
import com.health.mapper.*;
import com.health.utils.DateUtils;
import com.health.vo.MemberQueryVO;
import com.health.vo.MemberVO;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.time.LocalDate;
import java.util.List;

/**
 * 会员管理接口实现类
 */
@Service
@Transactional
public class MemberServiceImpl implements MemberService {

    // 会员基本信息
    @Autowired
    private MemberMapper memberMapper;

    //会员详细信息
    @Autowired
    private MemberInfoMapper memberInfoMapper;

    // 会员动态信息
    @Autowired
    private MemberDynamicInfoMapper memberDynamicInfoMapper;

    // 会员病史信息
    @Autowired
    private MemberMedicalHistoryMapper memberMedicalHistoryMapper;

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
        if ("".equals(queryString) || StringUtils.isBlank(queryString)) {
            queryString = null;
        } else {
            queryString = "%" + queryString + "%";
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
        // 实例化会员基本信息对象
        Member member = new Member();
        // 设置属性
        member.setId(memberVO.getId());
        member.setFilenumber(memberVO.getFilenumber());
        member.setName(memberVO.getName());
        member.setSex(memberVO.getSex());
        member.setIdcard(memberVO.getIdcard());
        member.setPhonenumber(memberVO.getPhonenumber());
        member.setRegtime(DateUtils.localDateToDate(LocalDate.now()));
        member.setPassword(memberVO.getPassword());
        member.setEmail(memberVO.getEmail());
        member.setBirthday(memberVO.getBirthday());
        member.setRemark(memberVO.getRemark());
        member.setCreateTime(DateUtils.localDateToDate(LocalDate.now()));
        member.setUpdateTime(null);
        member.setStatus(memberVO.getStatus());
        // 添加基本信息
        int i = memberMapper.insertSelective(member);

        // 实例化会员详细信息
        MemberInfo memberInfo = new MemberInfo();
        // 设置属性
        memberInfo.setTMemberId(memberVO.getId());
        memberInfo.setMaritalStatus(memberVO.getMaritalStatus());
        memberInfo.setJob(memberVO.getJob());
        memberInfo.setEducationDegree(memberVO.getEducationDegree());
        memberInfo.setNativePlace(memberVO.getNativePlace());

        memberInfo.setHealthMgrId(memberVO.getHealthMgrId());
        memberInfo.setCreateTime(DateUtils.localDateToDate(LocalDate.now()));
        memberInfo.setUpdateTime(null);

        // 添加会员详细信息
        int i1 = memberInfoMapper.insertSelective(memberInfo);

        // 实例化会员动态信息
        MemberDynamicInfo memberDynamicInfo = new MemberDynamicInfo();
        memberDynamicInfo.setTMemberId(memberVO.getId());
        memberDynamicInfo.setHeight(memberVO.getHeight());
        memberDynamicInfo.setWeight(memberVO.getWeight());
        memberDynamicInfo.setDbp(memberVO.getDbp());
        memberDynamicInfo.setSbp(memberVO.getSbp());
        memberDynamicInfo.setBreth(memberVO.getBreth());
        memberDynamicInfo.setThermometer(memberVO.getThermometer());
        memberDynamicInfo.setWaistline(memberVO.getWaistline());
        memberDynamicInfo.setHipline(memberVO.getHipline());
        memberDynamicInfo.setBmi(memberVO.getBmi());
        memberDynamicInfo.setSpo(memberVO.getSpo());
        memberDynamicInfo.setCreateTime(DateUtils.localDateToDate(LocalDate.now()));
        memberDynamicInfo.setUpdateTime(null);

        // 添加会员动态信息
        int i2 = memberDynamicInfoMapper.insertSelective(memberDynamicInfo);

        // 实例化会员病史信息
        MemberMedicalHistory memberMedicalHistory = new MemberMedicalHistory();
        // 设置属性
        memberMedicalHistory.setTMemberId(memberVO.getId());
        memberMedicalHistory.setPreviousHistory(memberVO.getPreviousHistory());
        memberMedicalHistory.setFamilyHistory(memberVO.getFamilyHistory());
        memberMedicalHistory.setAllergicHistory(memberVO.getAllergicHistory());
        memberMedicalHistory.setMedicalHistory(memberVO.getMedicalHistory());
        memberMedicalHistory.setChronicDisease(memberVO.getChronicDisease());
        memberMedicalHistory.setCreateTime(DateUtils.localDateToDate(LocalDate.now()));
        memberMedicalHistory.setUpdateTime(null);

        // 添加会员病史信息
        int i3 = memberMedicalHistoryMapper.insertSelective(memberMedicalHistory);

        // 定义总影响行数
        int total = i + i1 + i2 + i3;

        return total > 0;
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
     * 根据主键编号查询会员基本信息和详细信息
     *
     * @param id
     * @return
     */
    @Override
    public MemberVO findByMemberId(Integer id) {

        // 基本信息
        Member member = memberMapper.selectByPrimaryKey(id);

        // 详细信息
        MemberInfoExample example = new MemberInfoExample();
        MemberInfoExample.Criteria criteria = example.createCriteria();
        criteria.andTMemberIdEqualTo(id);
        List<MemberInfo> memberInfos = memberInfoMapper.selectByExample(example);
        MemberInfo memberInfo = memberInfos.get(0);

        // 动态信息
        MemberDynamicInfoExample example1 = new MemberDynamicInfoExample();
        MemberDynamicInfoExample.Criteria criteria1 = example1.createCriteria();
        criteria1.andTMemberIdEqualTo(id);
        List<MemberDynamicInfo> memberDynamicInfos = memberDynamicInfoMapper.selectByExample(example1);
        MemberDynamicInfo memberDynamicInfo = memberDynamicInfos.get(0);

        // 病史信息
        MemberMedicalHistoryExample example2 = new MemberMedicalHistoryExample();
        MemberMedicalHistoryExample.Criteria criteria2 = example2.createCriteria();
        criteria2.andTMemberIdEqualTo(id);
        List<MemberMedicalHistory> memberMedicalHistories = memberMedicalHistoryMapper.selectByExample(example2);
        MemberMedicalHistory memberMedicalHistory = memberMedicalHistories.get(0);

        // 设置属性
        MemberVO memberVO = new MemberVO();
        memberVO.setId(member.getId());
        memberVO.setFilenumber(member.getFilenumber());
        memberVO.setName(member.getName());
        memberVO.setSex(member.getSex());
        memberVO.setIdcard(member.getIdcard());
        memberVO.setBirthday(member.getBirthday());
        memberVO.setPhonenumber(member.getPhonenumber());
        memberVO.setRegtime(member.getRegtime());
        memberVO.setPassword(member.getPassword());
        memberVO.setEmail(member.getEmail());
        memberVO.setBirthday(member.getBirthday());
        memberVO.setRemark(member.getRemark());
        memberVO.setCreateTime(member.getCreateTime());
        memberVO.setUpdateTime(member.getUpdateTime());
        memberVO.setStatus(member.getStatus());

        memberVO.setMaritalStatus(memberInfo.getMaritalStatus());
        memberVO.setJob(memberInfo.getJob());
        memberVO.setEducationDegree(memberInfo.getEducationDegree());
        memberVO.setNativePlace(memberInfo.getNativePlace());

        memberVO.setHealthMgrId(memberInfo.getHealthMgrId());
        memberVO.setCreateTime(DateUtils.localDateToDate(LocalDate.now()));

        memberVO.setHeight(memberDynamicInfo.getHeight());
        memberVO.setWeight(memberDynamicInfo.getWeight());
        memberVO.setDbp(memberDynamicInfo.getDbp());
        memberVO.setSbp(memberDynamicInfo.getSbp());
        memberVO.setBreth(memberDynamicInfo.getBreth());
        memberVO.setThermometer(memberDynamicInfo.getThermometer());
        memberVO.setWaistline(memberDynamicInfo.getWaistline());
        memberVO.setHipline(memberDynamicInfo.getHipline());
        memberVO.setBmi(memberDynamicInfo.getBmi());
        memberVO.setSpo(memberDynamicInfo.getSpo());

        memberVO.setPreviousHistory(memberMedicalHistory.getPreviousHistory());
        memberVO.setFamilyHistory(memberMedicalHistory.getFamilyHistory());
        memberVO.setAllergicHistory(memberMedicalHistory.getAllergicHistory());
        memberVO.setMedicalHistory(memberMedicalHistory.getMedicalHistory());
        memberVO.setChronicDisease(memberMedicalHistory.getChronicDisease());

        return memberVO;
    }

    /**
     * 修改会员信息
     *
     * @param memberVO@return
     */
    @Override
    public Boolean updateMemberInfo(MemberVO memberVO) {

        Member member = memberMapper.selectByPrimaryKey(memberVO.getId());
        member.setFilenumber(memberVO.getFilenumber());
        member.setName(memberVO.getName());
        member.setSex(memberVO.getSex());
        member.setIdcard(memberVO.getIdcard());
        member.setBirthday(memberVO.getBirthday());
        member.setPhonenumber(memberVO.getPhonenumber());
        member.setPassword(memberVO.getPassword());
        member.setRegtime(memberVO.getRegtime());
        member.setEmail(memberVO.getEmail());
        member.setUpdateTime(DateUtils.localDateToDate(LocalDate.now()));
        member.setStatus(memberVO.getStatus());

        int i = memberMapper.updateByPrimaryKeySelective(member);

        // TODO 先查询会员详细信息,再修改信息
        MemberInfoExample memberInfoExample = new MemberInfoExample();
        MemberInfoExample.Criteria criteria1 = memberInfoExample.createCriteria();
        criteria1.andTMemberIdEqualTo(memberVO.getId());
        MemberInfo memberInfo = memberInfoMapper.selectByExample(memberInfoExample).get(0);

        memberInfo.setMaritalStatus(memberVO.getMaritalStatus());
        memberInfo.setJob(memberVO.getJob());
        memberInfo.setEducationDegree(memberVO.getEducationDegree());
        memberInfo.setNativePlace(memberVO.getNativePlace());
        memberInfo.setHealthMgrId(memberVO.getHealthMgrId());
        memberInfo.setUpdateTime(DateUtils.localDateToDate(LocalDate.now()));

        int i1 = memberInfoMapper.updateByPrimaryKeySelective(memberInfo);


        //  TODO 先查询会员动态信息,再修改信息
        MemberDynamicInfoExample dynamicinfoExample = new MemberDynamicInfoExample();
        MemberDynamicInfoExample.Criteria criteria2 = dynamicinfoExample.createCriteria();
        // 查询条件
        criteria2.andTMemberIdEqualTo(member.getId());
        // 查询
        MemberDynamicInfo memberDynamicInfo = memberDynamicInfoMapper.selectByExample(dynamicinfoExample).get(0);

        // 修改条件
        memberDynamicInfo.setHeight(memberVO.getHeight());
        memberDynamicInfo.setWeight(memberVO.getWeight());
        memberDynamicInfo.setDbp(memberVO.getDbp());
        memberDynamicInfo.setSbp(memberVO.getSbp());
        memberDynamicInfo.setBreth(memberVO.getBreth());
        memberDynamicInfo.setThermometer(memberVO.getThermometer());
        memberDynamicInfo.setWaistline(memberVO.getWaistline());
        memberDynamicInfo.setHipline(memberVO.getHipline());
        memberDynamicInfo.setBmi(memberVO.getBmi());
        memberDynamicInfo.setSpo(memberVO.getSpo());
        memberDynamicInfo.setUpdateTime(DateUtils.localDateToDate(LocalDate.now()));
        // 修改
        int i2 = memberDynamicInfoMapper.updateByPrimaryKeySelective(memberDynamicInfo);

        // 修改会员病史信息
        MemberMedicalHistoryExample medicalhistoryExample = new MemberMedicalHistoryExample();
        MemberMedicalHistoryExample.Criteria criteria3 = medicalhistoryExample.createCriteria();
        criteria3.andTMemberIdEqualTo(member.getId());
        MemberMedicalHistory memberMedicalHistory = memberMedicalHistoryMapper.selectByExample(medicalhistoryExample).get(0);

        memberMedicalHistory.setPreviousHistory(memberVO.getPreviousHistory());
        memberMedicalHistory.setFamilyHistory(memberVO.getFamilyHistory());
        memberMedicalHistory.setAllergicHistory(memberVO.getAllergicHistory());
        memberMedicalHistory.setMedicalHistory(memberVO.getMedicalHistory());
        memberMedicalHistory.setChronicDisease(memberVO.getChronicDisease());
        memberMedicalHistory.setUpdateTime(DateUtils.localDateToDate(LocalDate.now()));

        int i3 = memberMedicalHistoryMapper.updateByPrimaryKeySelective(memberMedicalHistory);

        // 定义总影响行数
        int total = i + i1 + i2 + i3;

        return total > 0;
    }

    /**
     * 查询所有健康管理师信息
     * 用于动态加载健康管理师下拉框
     *
     * @return
     */
    @Override
    public List<HealthMgr> queryHealthMgrs() {

        HealthMgrExample example = new HealthMgrExample();
        HealthMgrExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(0);

        return healthMgrMapper.selectByExample(example);
    }
}