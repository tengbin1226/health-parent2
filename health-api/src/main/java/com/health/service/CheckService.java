package com.health.service;


import com.health.bean.CheckGroup;
import com.health.bean.CheckGroupCheckiTem;
import com.health.bean.CheckiTem;
import com.health.entity.PageResult;

import java.util.List;
import java.util.Map;

/**
 * 检查项及检查组接口
 */
public interface CheckService {

    /**
     *  分页查询检查项信息
     * @param currentPage
     * @param pageSize
     * @param queryString
     * @return
     */
    PageResult<CheckiTem> queryCheckItem(Integer currentPage, Integer pageSize, String queryString);

    /**
     *  分页查询检查组信息
     * @param currentPage
     * @param pageSize
     * @param queryString
     * @return
     */
    PageResult<CheckGroup> queryCheckGroup(Integer currentPage, Integer pageSize, String queryString);


    /**
     *  根据编号查询检查项信息
     * @param id
     * @return
     */
    CheckiTem queryCheckitemById(Integer id);

    /**
     *  根据编号查询检查组信息
     * @param id
     * @return
     */
    CheckGroup queryCheckgroupById(Integer id);


    /**
     * 根据编号删除检查项信息
     * @param id
     * @return
     */
    int deleteCheckitemById(Integer id);


    /**
     * 根据编号删除检查组信息
     * @param id
     * @return
     */
    int deleteCheckgroupById(Integer id);


    /**
     * 添加检查项信息
     * @param checkiTem
     * @return
     */
    int addCheckitem(CheckiTem checkiTem);


    /**
     * 添加检查组信息
     * @param checkiTem
     * @return
     */
    int addCheckgroup(CheckGroup checkGroup,Integer[] checkitemIds);

    /**
     * 修改检查项信息
     * @param checkiTem
     * @return
     */
    int updateCheckitem(CheckiTem checkiTem);

    /**
     * 修改检查项信息
     * @param checkiTem
     * @return
     */
    int updateCheckgroup(CheckGroup checkGroup, Integer[] checkitemIds);

    /**
     * 查询所有检查组信息
     * @return
     */
    List<CheckiTem> queryAllCheckitems();

    /**
     * 根据检查项编号查询检查组信息
     * @param id
     * @return
     */
    List<CheckGroupCheckiTem> querycheckItemsByCheckGroupId(Integer id);
}
