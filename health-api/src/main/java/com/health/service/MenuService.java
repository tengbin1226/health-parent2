package com.health.service;

import com.health.bean.Menu;
import com.health.entity.PageResult;

import java.util.List;

public interface MenuService {

    /**
     * 查询所有菜单信息.由于动态加载菜单树
     *
     * @return
     */
    List<Menu> queryMenuInfo();

    /**
     * 分页查询菜单信息
     *
     * @param currentPage
     * @param pageSize
     * @param queryString
     * @return
     */
    PageResult<Menu> queryMenusByPage(Integer currentPage, Integer pageSize, String queryString);

    /**
     * 添加菜单信息
     *
     * @param menu
     * @return
     */
    Boolean addMenuInfo(Menu menu);


    /**
     * 根据主键删除菜单信息.逻辑删除
     *
     * @param id
     * @return
     */
    Boolean deleteById(Integer id);

    /**
     * 根据主键编号查询菜单信息
     *
     * @param id
     * @return
     */
    Menu findById(Integer id);

    /**
     *  修改菜单信息
     * @param menu
     * @return
     */
    Boolean updateMenuInfo(Menu menu);
}
