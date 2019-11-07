package com.health.mapper;

import com.health.bean.SetMeal;
import com.health.bean.SetMealExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SetMealMapper {
    int countByExample(SetMealExample example);

    int deleteByExample(SetMealExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SetMeal record);

    int insertSelective(SetMeal record);

    List<SetMeal> selectByExample(SetMealExample example);

    SetMeal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SetMeal record, @Param("example") SetMealExample example);

    int updateByExample(@Param("record") SetMeal record, @Param("example") SetMealExample example);

    int updateByPrimaryKeySelective(SetMeal record);

    int updateByPrimaryKey(SetMeal record);
}