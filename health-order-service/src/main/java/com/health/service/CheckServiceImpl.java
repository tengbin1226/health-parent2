package com.health.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.health.bean.CheckGroup;
import com.health.bean.CheckGroupCheckiTem;
import com.health.bean.CheckGroupCheckiTemExample;
import com.health.bean.CheckiTem;
import com.health.entity.PageResult;
import com.health.mapper.CheckGroupCheckiTemMapper;
import com.health.mapper.CheckGroupMapper;
import com.health.mapper.CheckiTemMapper;
import com.health.utils.DateUtils;
import com.health.vo.MemberQueryVO;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 检查组/项实现类
 */
@Service
@Transactional
public class CheckServiceImpl implements CheckService {

    @Autowired
    private CheckGroupMapper checkGroupMapper;

    @Autowired
    private CheckiTemMapper checkiTemMapper;

    @Autowired
    private CheckGroupCheckiTemMapper checkGroupCheckiTemMapper;

    /**
     * 分页查询检查组信息
     *
     * @param currentPage
     * @param pageSize
     * @param queryString
     * @return
     */
    @Override
    public PageResult<CheckiTem> queryCheckItem(Integer currentPage, Integer pageSize, String queryString) {

        //拼接模糊查询的%
        if ("".equals(queryString) || StringUtils.isBlank(queryString)) {
            queryString = null;
        } else {
            queryString = "%" + queryString + "%";
        }
        // 初始化分页对象
        PageInfo<CheckiTem> pageInfo = null;

        //使用pageHelper插件
        PageHelper.startPage(currentPage, pageSize);

        List<CheckiTem> checkiTems = checkiTemMapper.selectItems(queryString);

        pageInfo = new PageInfo<>(checkiTems);

        return new PageResult<>(pageInfo.getTotal(), pageInfo.getList());
    }

    /**
     * 根据编号查询检查项信息
     *
     * @param id
     * @return
     */
    @Override
    public CheckiTem queryCheckitemById(Integer id) {
        if (ObjectUtils.isNotEmpty(id)) {
            return checkiTemMapper.selectByPrimaryKey(id);
        }
        return null;
    }

    /**
     * 根据编号删除(修改状态)
     *
     * @param id
     * @return
     */
    @Override
    public int deleteCheckitemById(Integer id) {
        if (ObjectUtils.isNotEmpty(id)) {
            // 根据主键查询检查组信息
            CheckiTem checkiTem = checkiTemMapper.selectByPrimaryKey(id);
            // 设置属性
            checkiTem.setStatus("1");
            // 修改指定信息的状态值
            return checkiTemMapper.updateByPrimaryKeySelective(checkiTem);
        }
        return 0;
    }

    /**
     * 添加检查组信息
     *
     * @param checkiTem
     * @return
     */
    @Override
    public int addCheckitem(CheckiTem checkiTem) {
        if (ObjectUtils.isNotEmpty(checkiTem)) {
            // 设置状态
            checkiTem.setStatus("0");
            return checkiTemMapper.insertSelective(checkiTem);
        }
        return 0;
    }

    /**
     * 修改检查项信息
     *
     * @param checkiTem
     * @return
     */
    @Override
    public int updateCheckitem(CheckiTem checkiTem) {
        if (ObjectUtils.isNotEmpty(checkiTem)) {
            return checkiTemMapper.updateByPrimaryKeySelective(checkiTem);
        }
        return 0;
    }


    /**
     * 分页查询检查组信息
     *
     * @param currentPage
     * @param pageSize
     * @param queryString
     * @return
     */
    @Override
    public PageResult<CheckGroup> queryCheckGroup(Integer currentPage, Integer pageSize, String queryString) {
        //拼接模糊查询的%
        if ("".equals(queryString) || StringUtils.isBlank(queryString)) {
            queryString = null;
        } else {
            queryString = "%" + queryString + "%";
        }
        // 初始化分页对象
        PageInfo<CheckGroup> pageInfo = null;

        //使用pageHelper插件
        PageHelper.startPage(currentPage, pageSize);

        List<CheckGroup> checkGroups = checkGroupMapper.selectgroups(queryString);

        pageInfo = new PageInfo<>(checkGroups);

        return new PageResult<>(pageInfo.getTotal(), pageInfo.getList());
    }

    /**
     * 根据编号查询检查组信息
     *
     * @param id
     * @return
     */
    @Override
    public CheckGroup queryCheckgroupById(Integer id) {
        if (ObjectUtils.isNotEmpty(id)) {
            return checkGroupMapper.selectByPrimaryKey(id);
        }
        return null;
    }

    /**
     * 根据编号删除检查组信息
     *
     * @param id
     * @return
     */
    @Override
    public int deleteCheckgroupById(Integer id) {
        if (ObjectUtils.isNotEmpty(id)) {
            // 根据主键查询检查组信息
            CheckGroup checkGroup = checkGroupMapper.selectByPrimaryKey(id);
            // 设置属性
            checkGroup.setStatus("1");
            // 修改指定信息的状态值
            return checkGroupMapper.updateByPrimaryKeySelective(checkGroup);
        }
        return 0;
    }

    /**
     * 添加检查组信息
     *
     * @param checkGroup@return
     */
    @Override
    public int addCheckgroup(CheckGroup checkGroup, Integer[] checkitemIds) {
        if (ObjectUtils.isNotEmpty(checkGroup) && checkitemIds.length > 0) {

            // TODO 添加检查组信息
            checkGroup.setStatus("0");
            int i = checkGroupMapper.insertSelective(checkGroup);

            // 初始化中间表对象
            CheckGroupCheckiTem checkGroupCheckiTem = null;
            // 初始化受影响行数
            int j = 0;
            // TODO 遍历勾选的检查项编号后逐一添加
            for (Integer checkitemId : checkitemIds) {
                // 实例化对象
                checkGroupCheckiTem = new CheckGroupCheckiTem();
                // 设置属性
                checkGroupCheckiTem.setCheckgroupId(checkGroup.getId());
                checkGroupCheckiTem.setCheckitemId(checkitemId);
                checkGroupCheckiTem.setCreateTime(DateUtils.localDateToDate(LocalDate.now()));
                j = checkGroupCheckiTemMapper.insertSelective(checkGroupCheckiTem);
            }
            return i+j;
        }
        return 0;
    }

    /**
     * 修改检查项信息
     *
     * @param checkGroup@return
     */
    @Override
    public int updateCheckgroup(CheckGroup checkGroup, Integer[] checkitemIds) {
        if (ObjectUtils.isNotEmpty(checkGroup) && checkitemIds.length > 0) {

            // TODO 修改检查组信息
            int i = checkGroupMapper.updateByPrimaryKeySelective(checkGroup);

            // TODO 先删除原有的检查组与检查项关联信息,然后再添加新的信息
            // 初始化中间表对象
            CheckGroupCheckiTem checkGroupCheckiTem = null;
            // 初始化受影响行数
            int j = 0;

            // 创建删除条件
            CheckGroupCheckiTemExample example = new CheckGroupCheckiTemExample();
            CheckGroupCheckiTemExample.Criteria criteria = example.createCriteria();
            criteria.andCheckgroupIdEqualTo(checkGroup.getId());
            checkGroupCheckiTemMapper.deleteByExample(example);

            // TODO 遍历勾选的检查项编号后逐一添加
            for (Integer checkitemId : checkitemIds) {
                // 实例化对象
                checkGroupCheckiTem = new CheckGroupCheckiTem();
                // 设置属性
                checkGroupCheckiTem.setCheckgroupId(checkGroup.getId());
                checkGroupCheckiTem.setCheckitemId(checkitemId);
                checkGroupCheckiTem.setCreateTime(DateUtils.localDateToDate(LocalDate.now()));
                j = checkGroupCheckiTemMapper.insertSelective(checkGroupCheckiTem);
            }
            return i + j;
        }
        return 0;
    }

    /**
     * 查询所有检查组信息
     * @return
     */
    @Override
    public List<CheckiTem> queryAllCheckitems() {
        return checkiTemMapper.selectByExample(null);
    }


    /**
     * 根据检查项编号查询检查组信息
     *
     * @param id
     * @return
     */
    @Override
    public List<CheckGroupCheckiTem> querycheckItemsByCheckGroupId(Integer id) {

        // 根据主键编号查询检查项对象信息
        CheckGroup checkGroup = checkGroupMapper.selectByPrimaryKey(id);

        // 创建查询条件对象
        CheckGroupCheckiTemExample example=new CheckGroupCheckiTemExample();
        CheckGroupCheckiTemExample.Criteria criteria = example.createCriteria();
        criteria.andCheckgroupIdEqualTo(id);
        // 执行查询,获取查询结果集合
        List<CheckGroupCheckiTem> checkGroupCheckiTems = checkGroupCheckiTemMapper.selectByExample(example);


        // 返回
        return checkGroupCheckiTems;
    }
}
