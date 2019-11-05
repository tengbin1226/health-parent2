package com.health.service;

import com.health.bean.HealthMgr;

import java.util.List;

public interface HealthMgrService {

    /**
     * 查询所有健康管理师信息
     * @return
     */
    List<HealthMgr> queryHealthMgrs();

}
