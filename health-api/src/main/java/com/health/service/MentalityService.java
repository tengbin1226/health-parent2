package com.health.service;

import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.vo.BodyQueryVO;
import com.health.vo.MentalityQueryVO;

/**
 * 心理测评接口
 */
public interface MentalityService {

    /**
     * 分页查询心理测评信息
     * @param queryPageBean
     * @return
     */
    PageResult<MentalityQueryVO> queryBodyEvaluation(QueryPageBean queryPageBean);

    /**
     * 根据主键编号删除心理测评信息(逻辑删除)
     * @param id
     * @return
     */
    int deleteById(Integer id);

}
