package com.health.mapper;

import com.health.bean.BodyType;
import com.health.bean.BodyTypeExample;
import java.util.List;

import com.health.vo.BodyQueryVO;
import org.apache.ibatis.annotations.Param;

public interface BodyTypeMapper {
    int countByExample(BodyTypeExample example);

    int deleteByExample(BodyTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BodyType record);

    int insertSelective(BodyType record);

    List<BodyType> selectByExample(BodyTypeExample example);

    BodyType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BodyType record, @Param("example") BodyTypeExample example);

    int updateByExample(@Param("record") BodyType record, @Param("example") BodyTypeExample example);

    int updateByPrimaryKeySelective(BodyType record);

    int updateByPrimaryKey(BodyType record);
    
    /*查询体质信息*/
    List<BodyQueryVO> selectBodyInfo(String queryString);
}