package com.health.mapper;

import com.health.bean.CheckGroupCheckiTem;
import com.health.bean.CheckGroupCheckiTemExample;
import com.health.bean.CheckGroupCheckiTemKey;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CheckGroupCheckiTemMapper {
    int countByExample(CheckGroupCheckiTemExample example);

    int deleteByExample(CheckGroupCheckiTemExample example);

    int deleteByPrimaryKey(CheckGroupCheckiTemKey key);

    int insert(CheckGroupCheckiTem record);

    int insertSelective(CheckGroupCheckiTem record);

    List<CheckGroupCheckiTem> selectByExample(CheckGroupCheckiTemExample example);

    CheckGroupCheckiTem selectByPrimaryKey(CheckGroupCheckiTemKey key);

    int updateByExampleSelective(@Param("record") CheckGroupCheckiTem record, @Param("example") CheckGroupCheckiTemExample example);

    int updateByExample(@Param("record") CheckGroupCheckiTem record, @Param("example") CheckGroupCheckiTemExample example);

    int updateByPrimaryKeySelective(CheckGroupCheckiTem record);

    int updateByPrimaryKey(CheckGroupCheckiTem record);

    /* 根据检查组编号查询对应的检查项*/
    List<CheckGroupCheckiTem> selectByCheckGroupId(Integer id);
}