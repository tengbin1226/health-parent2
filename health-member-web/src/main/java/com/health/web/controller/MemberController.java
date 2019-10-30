package com.health.web.controller;

import com.health.constant.MessageConstant;
import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.entity.Result;
import com.health.service.MemberService;
import com.health.vo.MemberVO;
import com.health.vo.MemberQueryVO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

/**
 * 会员管理控制器
 */
@Controller
@RequestMapping("/memberInfo")
public class MemberController {

    @Reference(check = false)
    private MemberService memberService;

    /**
     * 跳转到页面
     */
    @GetMapping("/member")
    public String toMemberPage(){
        return "member";
    }

    /**
     * 分页查询会员信息
     *
     * @return
     */
    @GetMapping("/members")
    @ResponseBody
    public PageResult<MemberQueryVO> queryMemebers(@RequestParam Integer currentPage,@RequestParam Integer pageSize,@RequestParam String queryString) {
        // 获取分页查询结果
        PageResult<MemberQueryVO> pageResult = memberService.queryMembers(currentPage,pageSize,queryString);

        return pageResult;
    }

    /**
     * 添加会员信息
     *
     * @param memberAddVO
     * @return
     */
    @PostMapping("/member")
    public Result addMemberInfo(MemberVO memberAddVO) {
        // 实例化返回结果
        Result Result = new Result();
        // 添加会员信息
        Boolean flag = memberService.addMember(memberAddVO);
        if (flag) {
            // 设置属性
            Result.setMessage(MessageConstant.ADD_MEMBER_SUCCESS);
            Result.setFlag(true);
        } else {
            // 设置属性
            Result.setMessage(MessageConstant.ADD_MEMBER_FAIL);
            Result.setFlag(false);
        }
        return Result;
    }

    /**
     * 根据主键编号删除会员信息
     *
     * @param id
     * @return
     */
    @DeleteMapping("/member/{id}")
    public Result deleteMemberInfo(@PathVariable Integer id) {
        // 实例化返回结果
        Result Result = new Result();
        // 删除所有会员信息
        Boolean flag = memberService.updateMemberStatus(id);
        if (flag) {
            // 设置属性
            Result.setMessage(MessageConstant.DELETE_MEMBER_SUCCESS);
            Result.setFlag(true);
        } else {
            // 设置属性
            Result.setMessage(MessageConstant.DELETE_MEMBER_FAIL);
            Result.setFlag(false);
        }
        return Result;
    }

    /**
     * 根据主键编号查询会员信息
     *
     * @param id
     * @return
     */
    @GetMapping("/member/{id}")
    public String findMemberById(@PathVariable Integer id, Model model) {
        // 获取会员信息
        MemberVO memberVO = memberService.findByMemberId(id);
        // 添加属性
        model.addAttribute("memberVO", memberVO);
        // 返回指定页面
        return "modify";
    }

    /**
     * 修改会员信息
     *
     * @param memberAddVO
     * @return
     */
    @PutMapping("/member")
    public Result updateMemberInfo(MemberVO memberAddVO) {
        // 实例化返回结果
        Result Result = new Result();

        // 修改会员信息
        Boolean flag = memberService.updateMemberInfo(memberAddVO);

        if (flag) {
            // 设置属性
            Result.setMessage(MessageConstant.EDIT_MEMBER_SUCCESS);
            Result.setFlag(true);
        } else {
            // 设置属性
            Result.setMessage(MessageConstant.EDIT_MEMBER_FAIL);
            Result.setFlag(false);
        }
        return Result;
    }

}
