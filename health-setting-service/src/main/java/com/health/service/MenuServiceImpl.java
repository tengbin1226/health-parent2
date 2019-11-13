package com.health.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.health.bean.Menu;
import com.health.bean.MenuExample;
import com.health.entity.PageResult;
import com.health.exception.CustomException;
import com.health.mapper.MenuMapper;
import com.health.utils.DateUtils;
import com.mysql.jdbc.MysqlErrorNumbers;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
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

        pageInfo = new PageInfo<>(menus);

        return new PageResult<>(pageInfo.getTotal(), pageInfo.getList());
    }

    /**
     * 添加菜单信息
     *
     * @param menu
     * @return
     */
    @Override
    public Boolean addMenuInfo(Menu menu) {
        if (ObjectUtils.isNotEmpty(menu)) {

            // 查询添加前菜单的优先级
            Integer priorityNum = menuMapper.selecMenuPriority();

            // TODO 判断当前添加的菜单信息是否为父菜单,进入if语句则为父菜单,不进入则为子菜单
            if (ObjectUtils.isEmpty(menu.getParentmenuid())) {
                // 设置当前添加的菜单路径
                Integer path = priorityNum + 2;
                menu.setPath(path.toString());

                // 设置当前添加的菜单优先级
                menu.setPriority((priorityNum + 1));

                // 设置等级
                menu.setLevel(1);

                // 设置状态
                menu.setStatus(0);

                // 设置创建时间
                menu.setCreateTime(DateUtils.localDateToDate(LocalDate.now()));

                // 确认添加添加当前菜单信息
                int i = menuMapper.insertSelective(menu);

                return i > 0;
            }

            // TODO 子菜单添加操作

            // 查询当前添加的菜单的父菜单拥有的子菜单数量
            int submenuCount = menuMapper.selectSubmenu(menu.getParentmenuid());

            // 获取父菜单的path值
            Menu menu1 = menuMapper.selectByPrimaryKey(menu.getParentmenuid());
            String parentPath = menu1.getPath();
            // 设置当前添加的菜单的优先级属性值
            menu.setPriority((submenuCount + 1));

            //设置当前添加的菜单的路径属性值
            String path = "/" + parentPath + "-" + (submenuCount + 1);
            menu.setPath(path);

            // 设置等级
            menu.setLevel(2);

            // 设置状态
            menu.setStatus(0);

            // 设置创建时间
            menu.setCreateTime(DateUtils.localDateToDate(LocalDate.now()));

            // 确认添加添加当前菜单信息
            int i = menuMapper.insertSelective(menu);

            return i > 0;

        }
        throw new CustomException("未获取到需添加的菜单编号");
    }

    /**
     * 根据主键删除菜单信息.逻辑删除
     *
     * @param id
     * @return
     */
    @Override
    public Boolean deleteById(Integer id) {
        if (ObjectUtils.isNotEmpty(id)) {

            // 根据当前菜单编号查询子菜单数量
            int submenu = menuMapper.selectSubmenu(id);

            /* 若进入if判断,则当前id值表示父菜单编号*/
            if (submenu > 0) {
                // TODO 根据父菜单编号查询子菜单信息
                MenuExample menuExample = new MenuExample();
                MenuExample.Criteria criteria = menuExample.createCriteria();
                criteria.andParentmenuidEqualTo(id);
                // 获取子菜单查询结果集
                List<Menu> menus = menuMapper.selectByExample(menuExample);

                // 遍历更改子菜单的状态值
                for (Menu menu1 : menus) {
                    menu1.setStatus(1);
                    int j = menuMapper.updateByPrimaryKeySelective(menu1);
                }
            }
            // 根据主键查询菜单信息对象
            Menu menu = menuMapper.selectByPrimaryKey(id);
            // 设置属性值
            menu.setStatus(1);
            // 确认修改菜单的状态值
            int i = menuMapper.updateByPrimaryKeySelective(menu);

            return i > 0;
        }
        throw new CustomException("未获取到需删除的菜单编号");
    }

    /**
     * 根据主键编号查询菜单信息
     *
     * @param id
     * @return
     */
    @Override
    public Menu findById(Integer id) {
        if (ObjectUtils.isNotEmpty(id)) {
            // 根据主键查询菜单信息对象
            return menuMapper.selectByPrimaryKey(id);
        }
        throw new CustomException("未获取到需查询的菜单编号");
    }

    /**
     * 修改菜单信息
     *
     * @param menu
     * @return
     */
    @Override
    public Boolean updateMenuInfo(Menu menu) {
        if (ObjectUtils.isNotEmpty(menu)) {
            // 设置修改时间
            menu.setUpdateTime(DateUtils.localDateToDate(LocalDate.now()));
            // 确认修改当亲菜单信息
            int i = menuMapper.updateByPrimaryKeySelective(menu);
            return i > 0;
        }
        throw new CustomException("未获取到需修改的菜单信息");
    }

    /**
     * 查询所有父菜单信息
     *
     * @return
     */
    @Override
    public List<Menu> querParentMenus() {

        // 创建查询条件
        MenuExample menuExample = new MenuExample();
        MenuExample.Criteria criteria = menuExample.createCriteria();
        criteria.andLevelEqualTo(1);

        // 返回查询结果集
        return menuMapper.selectByExample(menuExample);
    }
}
