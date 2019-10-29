package com.health.mapper;

import com.health.bean.MemberMedicalHistory;
import com.health.bean.MemberMedicalHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberMedicalHistoryMapper {
    int countByExample(MemberMedicalHistoryExample example);

    int deleteByExample(MemberMedicalHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MemberMedicalHistory record);

    int insertSelective(MemberMedicalHistory record);

    List<MemberMedicalHistory> selectByExampleWithBLOBs(MemberMedicalHistoryExample example);

    List<MemberMedicalHistory> selectByExample(MemberMedicalHistoryExample example);

    MemberMedicalHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MemberMedicalHistory record, @Param("example") MemberMedicalHistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") MemberMedicalHistory record, @Param("example") MemberMedicalHistoryExample example);

    int updateByExample(@Param("record") MemberMedicalHistory record, @Param("example") MemberMedicalHistoryExample example);

    int updateByPrimaryKeySelective(MemberMedicalHistory record);

    int updateByPrimaryKeyWithBLOBs(MemberMedicalHistory record);

    int updateByPrimaryKey(MemberMedicalHistory record);
}