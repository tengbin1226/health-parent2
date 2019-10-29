package com.health.web.controller;

import com.health.entity.PageResult;
import com.health.entity.QueryPageBean;
import com.health.entity.Result;
import com.health.service.MemberService;
import com.health.vo.MemberAddVO;
import com.health.vo.MemberVO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public PageResult<MemberVO> queryMemebers() {

        PageResult<MemberVO> pageResult = memberService.queryMembers(1,6,null);

        return pageResult;
    }

    /**
     * 添加会员信息
     *
     * @param memberAddVO
     * @return
     */
    @PostMapping("/member")
    public Result addMemberInfo(MemberAddVO memberAddVO) {
        // 实例化返回结果
        Result Result = new Result();
        // 添加会员信息
        Boolean flag = memberService.addMember(memberAddVO);
        if (flag) {
            // 设置属性
            Result.setMessage("添加成功!");
            Result.setFlag(true);
        } else {
            // 设置属性
            Result.setMessage("添加失败!请检查代码后重试");
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
        Boolean flag = memberService.deleteMemberById(id);
        if (flag) {
            // 设置属性
            Result.setMessage("删除成功!");
            Result.setFlag(true);
        } else {
            // 设置属性
            Result.setMessage("删除失败!请检查代码后重试");
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
    public Result updateMemberInfo(MemberAddVO memberAddVO) {
        // 实例化返回结果
        Result Result = new Result();

        // 修改会员信息
        Boolean flag = memberService.updateMemberInfo(memberAddVO);

        if (flag) {
            // 设置属性
            Result.setMessage("修改成功!");
            Result.setFlag(true);
        } else {
            // 设置属性
            Result.setMessage("修改失败!请检查代码后重试");
            Result.setFlag(false);
        }
        return Result;
    }

}
