package com.health.mapper;

import com.health.bean.MemberDynamicInfo;
import com.health.bean.MemberDynamicInfoExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MemberDynamicInfoMapper {
    int countByExample(MemberDynamicInfoExample example);

    int deleteByExample(MemberDynamicInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MemberDynamicInfo record);

    int insertSelective(MemberDynamicInfo record);

    List<MemberDynamicInfo> selectByExample(MemberDynamicInfoExample example);

    MemberDynamicInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MemberDynamicInfo record, @Param("example") MemberDynamicInfoExample example);

    int updateByExample(@Param("record") MemberDynamicInfo record, @Param("example") MemberDynamicInfoExample example);

    int updateByPrimaryKeySelective(MemberDynamicInfo record);

    int updateByPrimaryKey(MemberDynamicInfo record);
}