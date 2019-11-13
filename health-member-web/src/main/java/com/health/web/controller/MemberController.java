package com.health.web.controller;

import com.github.pagehelper.PageInfo;
import com.health.bean.HealthMgr;
import com.health.constant.MessageConstant;
import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.entity.Result;
import com.health.service.MemberService;
import com.health.vo.MemberQueryVO;
import com.health.vo.MemberVO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 会员管理后端控制器
 */
@CrossOrigin(origins = "*",allowCredentials="true",allowedHeaders = "",methods = {})
@Controller
@RequestMapping("/memberInfo")
public class MemberController {

    // 会员接口
    @Reference(check = false)
    private MemberService memberService;

    /**
     * 跳转到页面
     */
    @GetMapping("/member")
    public String toMemberPage() {
        return "member";
    }

    @GetMapping("/report")
    public String toReportPage(){
        return "report_member";
    }

    /**
     * 分页查询会员信息
     *
     * @return
     */
    @PostMapping("/members")
    @ResponseBody
    public PageResult<MemberQueryVO> queryMemebers(@RequestBody QueryPageBean queryPageBean) {

        // 获取分页查询结果
        PageInfo<MemberQueryVO> members = memberService.queryMembers(queryPageBean.getCurrentPage(),queryPageBean.getPageSize(),queryPageBean.getQueryString());

        // 实例化自定义分页对象
        PageResult<MemberQueryVO> pageResult=new PageResult<>();
        pageResult.setRows(members.getList());
        pageResult.setTotal(members.getTotal());

        return pageResult;
    }

    /**
     * 动态加载健康管理师下拉框
     * @return
     */
    @PostMapping("/healthMgrInfo")
    @ResponseBody
    public Result initHealthInfo(){
        // 实例化返回结果
        Result result = new Result();

        // 获取健康管理师信息
        List<HealthMgr> healthMgrs = memberService.queryHealthMgrs();

        if (healthMgrs.size()>0){
            result.setFlag(true);
            result.setMessage("查询信息成功!");
            result.setData(healthMgrs);
        }else {
            result.setFlag(false);
            result.setMessage("查询信息失败!");
            result.setData(null);
        }

        return result;
    }


    /**
     * 添加会员信息
     *
     * @param memberAddVO
     * @return
     */
    @PostMapping("/addmember")
    @ResponseBody
    public Result addMemberInfo(@RequestBody MemberVO memberAddVO) {
        // 实例化返回结果
        Result result = new Result();
        // 添加会员信息
        Boolean flag = memberService.addMember(memberAddVO);
        if (flag) {
            // 设置属性
            result.setMessage(MessageConstant.ADD_MEMBER_SUCCESS);
            result.setFlag(true);
        } else {
            // 设置属性
            result.setMessage(MessageConstant.ADD_MEMBER_FAIL);
            result.setFlag(false);
        }
        return result;
    }

    /**
     * 根据主键编号删除会员信息
     *
     * @param id
     * @return
     */
    @GetMapping("/member/{id}")
    @ResponseBody
    public Result deleteMemberInfo(@PathVariable Integer id) {
        // 实例化返回结果
        Result result = new Result();
        // 删除所有会员信息
        Boolean flag = memberService.updateMemberStatus(id);
        if (flag) {
            // 设置属性
            result.setMessage(MessageConstant.DELETE_MEMBER_SUCCESS);
            result.setFlag(true);
        } else {
            // 设置属性
            result.setMessage(MessageConstant.DELETE_MEMBER_FAIL);
            result.setFlag(false);
        }
        return result;
    }

    /**
     * 根据主键编号查询会员信息
     *
     * @param id
     * @return
     */
    @GetMapping("/memberInfo/{id}")
    @ResponseBody
    public Result findMemberById(@PathVariable Integer id) {
        // 初始化结果对象
        Result result=new Result();
        // 获取会员信息
        MemberVO memberVO = memberService.findByMemberId(id);

        // 判断是否获取到会员信息,并设置结果对象属性
        if (ObjectUtils.isEmpty(memberVO)){
            result.setFlag(false);
            result.setMessage(MessageConstant.GET_MEMBER_FAIL);
            result.setData(null);
        }else {
            result.setFlag(true);
            result.setMessage(MessageConstant.GET_MEMBER_SUCCESS);
            result.setData(memberVO);
        }
        return result;
    }

    /**
     * 修改会员信息
     *
     * @param memberAddVO
     * @return
     */
    @PostMapping("/updatemember")
    @ResponseBody
    public Result updateMemberInfo(@RequestBody MemberVO memberVO) {
        // 实例化返回结果
        Result result = new Result();

        // 修改会员信息
        Boolean flag = memberService.updateMemberInfo(memberVO);

        if (flag) {
            // 设置属性
            result.setMessage(MessageConstant.EDIT_MEMBER_SUCCESS);
            result.setFlag(true);
        } else {
            // 设置属性
            result.setMessage(MessageConstant.EDIT_MEMBER_FAIL);
            result.setFlag(false);
        }
        return result;
    }

    @GetMapping("/countMemberDynamic")
    @ResponseBody
    public Result countMemberDynamic(){
        // 初始化
        Map<String, List> map = new HashMap<>();
        List<String> monthList = new ArrayList<>();
        List<Integer> countMonthList = new ArrayList<>();

        //monthList 月份表
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, -12);

        for (int i = 0; i < 12; i++) {
            calendar.add(Calendar.MONTH, 1);
            monthList.add(new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime()).toString());
        }
        map.put("months", monthList);

        //countMonthList 用户统计结果表
        for (String s : monthList) {
            String month = s + "-31";
            int monthCount = memberService.countMemberByMonth(s);
            countMonthList.add(monthCount);
        }
        map.put("count", countMonthList);

        // 返回实例化结果对象
        return  new Result(true, MessageConstant.GET_MEMBER_NUMBER_REPORT_SUCCESS, map);
    }

}
