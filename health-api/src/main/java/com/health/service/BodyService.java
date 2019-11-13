package com.health.service;

import com.health.bean.BodyTest;
import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.vo.BodyQueryVO;

import java.util.List;

/**
 * 健康评估接口
 */
public interface BodyService {

    /**
     * 分页查询体质测评信息
     * @param queryString
     * @return
     */
    PageResult<BodyQueryVO> queryBodyEvaluation(QueryPageBean queryPageBean);

    /**
     * 查询所有体质调查问题
     * @return
     */
    List<BodyTest> queryTests();

    /**
     *  根据编号删除体质测评信息(逻辑删除)
     * @param id
     * @return
     */
    Boolean deleteById(Integer id);
}
