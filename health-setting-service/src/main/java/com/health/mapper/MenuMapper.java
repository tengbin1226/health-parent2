package com.health.mapper;

import com.health.bean.Menu;
import com.health.bean.MenuExample;

import java.util.List;

import com.health.vo.MemberQueryVO;
import org.apache.ibatis.annotations.Param;

public interface MenuMapper {
    int countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExample(MenuExample example);

    Menu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    /*查询菜单信息*/
    List<Menu> selectMenus();

    /*分页查询菜单信息*/
    List<Menu> selectMenuByPage(String queryString);

    /*查询添加前菜单的优先级*/
    int selecMenuPriority();
    /*查询指定菜单是否有子菜单(子菜单数量)*/
    int selectSubmenu(Integer parentmenuid);
}