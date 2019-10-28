package com.health.mapper;

import com.health.bean.HealthMgr;
import com.health.bean.HealthMgrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HealthMgrMapper {
    int countByExample(HealthMgrExample example);

    int deleteByExample(HealthMgrExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HealthMgr record);

    int insertSelective(HealthMgr record);

    List<HealthMgr> selectByExample(HealthMgrExample example);

    HealthMgr selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HealthMgr record, @Param("example") HealthMgrExample example);

    int updateByExample(@Param("record") HealthMgr record, @Param("example") HealthMgrExample example);

    int updateByPrimaryKeySelective(HealthMgr record);

    int updateByPrimaryKey(HealthMgr record);
}