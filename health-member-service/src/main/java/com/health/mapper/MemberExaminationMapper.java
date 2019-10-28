package com.health.mapper;

import com.health.bean.MemberExamination;
import com.health.bean.MemberExaminationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberExaminationMapper {
    int countByExample(MemberExaminationExample example);

    int deleteByExample(MemberExaminationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MemberExamination record);

    int insertSelective(MemberExamination record);

    List<MemberExamination> selectByExample(MemberExaminationExample example);

    MemberExamination selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MemberExamination record, @Param("example") MemberExaminationExample example);

    int updateByExample(@Param("record") MemberExamination record, @Param("example") MemberExaminationExample example);

    int updateByPrimaryKeySelective(MemberExamination record);

    int updateByPrimaryKey(MemberExamination record);
}