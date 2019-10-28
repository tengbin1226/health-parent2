package com.health.mapper;

import com.health.bean.MemberMedicalhistory;
import com.health.bean.MemberMedicalhistoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberMedicalhistoryMapper {
    int countByExample(MemberMedicalhistoryExample example);

    int deleteByExample(MemberMedicalhistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MemberMedicalhistory record);

    int insertSelective(MemberMedicalhistory record);

    List<MemberMedicalhistory> selectByExample(MemberMedicalhistoryExample example);

    MemberMedicalhistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MemberMedicalhistory record, @Param("example") MemberMedicalhistoryExample example);

    int updateByExample(@Param("record") MemberMedicalhistory record, @Param("example") MemberMedicalhistoryExample example);

    int updateByPrimaryKeySelective(MemberMedicalhistory record);

    int updateByPrimaryKey(MemberMedicalhistory record);
}