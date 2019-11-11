package com.health.service;

import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.vo.BodyQueryVO;

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

}
