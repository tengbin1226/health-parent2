package com.health.mapper;

import com.health.bean.MemberDynamicinfo;
import com.health.bean.MemberDynamicinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberDynamicinfoMapper {
    int countByExample(MemberDynamicinfoExample example);

    int deleteByExample(MemberDynamicinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MemberDynamicinfo record);

    int insertSelective(MemberDynamicinfo record);

    List<MemberDynamicinfo> selectByExample(MemberDynamicinfoExample example);

    MemberDynamicinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MemberDynamicinfo record, @Param("example") MemberDynamicinfoExample example);

    int updateByExample(@Param("record") MemberDynamicinfo record, @Param("example") MemberDynamicinfoExample example);

    int updateByPrimaryKeySelective(MemberDynamicinfo record);

    int updateByPrimaryKey(MemberDynamicinfo record);
}