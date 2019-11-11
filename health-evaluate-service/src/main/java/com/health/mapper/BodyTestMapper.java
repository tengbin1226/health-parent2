package com.health.mapper;

import com.health.bean.BodyTest;
import com.health.bean.BodyTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BodyTestMapper {
    int countByExample(BodyTestExample example);

    int deleteByExample(BodyTestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BodyTest record);

    int insertSelective(BodyTest record);

    List<BodyTest> selectByExample(BodyTestExample example);

    BodyTest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BodyTest record, @Param("example") BodyTestExample example);

    int updateByExample(@Param("record") BodyTest record, @Param("example") BodyTestExample example);

    int updateByPrimaryKeySelective(BodyTest record);

    int updateByPrimaryKey(BodyTest record);
}