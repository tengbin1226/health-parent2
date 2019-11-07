package com.health.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.health.bean.Menu;
import com.health.entity.PageResult;
import com.health.mapper.MenuMapper;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 菜单接口实现类
 */
@Service
@Transactional
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    /**
     * 查询所有菜单信息.由于动态加载菜单树
     *
     * @param queryString
     * @return
     */
    @Override
    public List<Menu> queryMenuInfo() {
        return menuMapper.selectMenus();
    }


    /**
     * 分页查询菜单信息
     *
     * @param currentPage
     * @param pageSize
     * @param queryString
     * @return
     */
    @Override
    public PageResult<Menu> queryMenusByPage(Integer currentPage, Integer pageSize, String queryString) {
        //拼接模糊查询的%
        if ("".equals(queryString) || StringUtils.isBlank(queryString)) {
            queryString = null;
        } else {
            queryString = "%" + queryString + "%";
        }
        // 初始化分页对象
        PageInfo<Menu> pageInfo = null;

        //使用pageHelper插件
        PageHelper.startPage(currentPage, pageSize);

        List<Menu> menus = menuMapper.selectMenuByPage(queryString);

        pageInfo=new PageInfo<>(menus);

        return new PageResult<>(pageInfo.getTotal(),pageInfo.getList());
    }

    /**
     * 添加菜单信息
     *
     * @param menu
     * @return
     */
    @Override
    public Boolean addMenuInfo(Menu menu) {
        if (ObjectUtils.isNotEmpty(menu)){
            // 设置状态
            menu.setStatus(0);
            int i = menuMapper.insertSelective(menu);
            return  i>0;
        }
        return false;
    }

    /**
     * 根据主键删除菜单信息.逻辑删除
     *
     * @param id
     * @return
     */
    @Override
    public Boolean deleteById(Integer id) {
        if (ObjectUtils.isNotEmpty(id)){
            // 根据主键查询菜单信息对象
            Menu menu = menuMapper.selectByPrimaryKey(id);
            // 设置属性值
            menu.setStatus(1);
            int i = menuMapper.updateByPrimaryKey(menu);
            return i>0;
        }
        return false;
    }

    /**
     * 根据主键编号查询菜单信息
     *
     * @param id
     * @return
     */
    @Override
    public Menu findById(Integer id) {
        if (ObjectUtils.isNotEmpty(id)){
            // 根据主键查询菜单信息对象
            return menuMapper.selectByPrimaryKey(id);
        }
        return null;
    }

    /**
     * 修改菜单信息
     *
     * @param menu
     * @return
     */
    @Override
    public Boolean updateMenuInfo(Menu menu) {
        if (ObjectUtils.isNotEmpty(menu)){
            int i = menuMapper.updateByPrimaryKeySelective(menu);
            return  i>0;
        }
        return false;
    }

}
