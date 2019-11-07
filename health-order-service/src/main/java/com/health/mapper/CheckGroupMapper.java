package com.health.mapper;

import com.health.bean.CheckGroup;
import com.health.bean.CheckGroupExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CheckGroupMapper {
    int countByExample(CheckGroupExample example);

    int deleteByExample(CheckGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CheckGroup record);

    int insertSelective(CheckGroup record);

    List<CheckGroup> selectByExample(CheckGroupExample example);

    CheckGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CheckGroup record, @Param("example") CheckGroupExample example);

    int updateByExample(@Param("record") CheckGroup record, @Param("example") CheckGroupExample example);

    int updateByPrimaryKeySelective(CheckGroup record);

    int updateByPrimaryKey(CheckGroup record);

    /*条件查询检查组信息*/
    List<CheckGroup> selectgroups(String queryString);
}