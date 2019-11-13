package com.health.web.controller;

import com.health.bean.Menu;
import com.health.bean.Permission;
import com.health.bean.Role;
import com.health.constant.MessageConstant;
import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.entity.Result;
import com.health.service.RoleService;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

/**
 * 角色后端控制器
 */
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "", methods = {})
@Controller
@RequestMapping("/role")
public class RoleController {

    // 角色
    @Reference(check = false)
    private RoleService roleService;

    /**
     * 跳转到角色管理页面
     *
     * @return
     */
    @GetMapping("/role")
    public String toRolePage() {
        return "role";
    }

    /**
     * 分页查询角色信息
     *
     * @param queryPageBean
     * @return
     */
    @PostMapping("/roles")
    @ResponseBody
    public PageResult<Role> queryRolesByPage(@RequestBody QueryPageBean queryPageBean) {
        return roleService.queryAllRoles(queryPageBean.getCurrentPage(), queryPageBean.getPageSize(), queryPageBean.getQueryString());
    }


    /**
     * 查询所有角色信息
     * 用于动态加载用户管理的角色信息
     *
     * @return
     */
    @GetMapping("/findroles")
    @ResponseBody
    public List<Role> queryAllRoles() {
        return roleService.queryRoles();
    }


    /**
     * 根据用户编号查询用户所拥有的角色信息
     *
     * @param id
     * @return
     */
    @GetMapping("/queryByUserId/{id}")
    @ResponseBody
    public Result queryRoleByUserId(@PathVariable Integer id) {
        List<Role> roles = roleService.queryRolesByUserId(id);
        if (ObjectUtils.isNotEmpty(roles)) {
            return new Result(true, MessageConstant.GET_ROLEBYID_SUCCESS, roles);
        }
        return new Result(false, MessageConstant.GET_ROLEBYID_FAIL, null);
    }

    /**
     * 查询所有权限信息
     *
     * @return
     */
    @PostMapping("/findAllPermissions")
    @ResponseBody
    public List<Permission> findAllPermissions() {
        return roleService.findAllPermissions();
    }

    /**
     * 查询所有菜单信息
     *
     * @return
     */
    @PostMapping("/findAllMenus")
    @ResponseBody
    public List<Menu> findAllMenus() {
        return roleService.findAllMenus();
    }

}
