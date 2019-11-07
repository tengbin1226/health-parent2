package com.health.mapper;

import com.health.bean.CheckiTem;
import com.health.bean.CheckiTemExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CheckiTemMapper {
    int countByExample(CheckiTemExample example);

    int deleteByExample(CheckiTemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CheckiTem record);

    int insertSelective(CheckiTem record);

    List<CheckiTem> selectByExample(CheckiTemExample example);

    CheckiTem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CheckiTem record, @Param("example") CheckiTemExample example);

    int updateByExample(@Param("record") CheckiTem record, @Param("example") CheckiTemExample example);

    int updateByPrimaryKeySelective(CheckiTem record);

    int updateByPrimaryKey(CheckiTem record);

    /*模糊查询检查组信息*/
    List<CheckiTem> selectItems(String queryString);

}