package com.health.mapper;

import com.health.bean.MenuPermission;
import com.health.bean.MenuPermissionExample;
import com.health.bean.MenuPermissionKey;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MenuPermissionMapper {
    int countByExample(MenuPermissionExample example);

    int deleteByExample(MenuPermissionExample example);

    int deleteByPrimaryKey(MenuPermissionKey key);

    int insert(MenuPermission record);

    int insertSelective(MenuPermission record);

    List<MenuPermission> selectByExample(MenuPermissionExample example);

    MenuPermission selectByPrimaryKey(MenuPermissionKey key);

    int updateByExampleSelective(@Param("record") MenuPermission record, @Param("example") MenuPermissionExample example);

    int updateByExample(@Param("record") MenuPermission record, @Param("example") MenuPermissionExample example);

    int updateByPrimaryKeySelective(MenuPermission record);

    int updateByPrimaryKey(MenuPermission record);
}