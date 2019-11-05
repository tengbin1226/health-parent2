package com.health.service;

import com.health.bean.HealthMgr;
import com.health.bean.HealthMgrExample;
import com.health.mapper.HealthMgrMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;

import java.util.List;

/**
 * 健康管理师接口实现类
 */
@Service
public class HealthMgrServiceImpl implements HealthMgrService {

    @Autowired
    private HealthMgrMapper healthMgrMapper;


    /**
     * 查询所有状态为启用的健康管理师信息
     *
     * @return
     */
    @Override
    public List<HealthMgr> queryHealthMgrs() {
        HealthMgrExample example=new HealthMgrExample();
        HealthMgrExample.Criteria criteria = example.createCriteria();
        criteria.andStatusEqualTo(0);
        return healthMgrMapper.selectByExample(example);
    }
}
