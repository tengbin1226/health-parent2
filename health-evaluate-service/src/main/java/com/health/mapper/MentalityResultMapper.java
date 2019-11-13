package com.health.mapper;

import com.health.bean.MentalityResult;
import com.health.bean.MentalityResultExample;

import java.util.List;

import com.health.vo.MentalityQueryVO;
import org.apache.ibatis.annotations.Param;

public interface MentalityResultMapper {
    int countByExample(MentalityResultExample example);

    int deleteByExample(MentalityResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MentalityResult record);

    int insertSelective(MentalityResult record);

    List<MentalityResult> selectByExample(MentalityResultExample example);

    MentalityResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MentalityResult record, @Param("example") MentalityResultExample example);

    int updateByExample(@Param("record") MentalityResult record, @Param("example") MentalityResultExample example);

    int updateByPrimaryKeySelective(MentalityResult record);

    int updateByPrimaryKey(MentalityResult record);

    /*查询指定心理测测评信息*/
    List<MentalityQueryVO> queryMentalityInfos(String queryString);
}