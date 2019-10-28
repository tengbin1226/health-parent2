package com.health.web.controller;

import com.github.pagehelper.PageInfo;
import com.health.constants.ReturnMsg;
import com.health.service.MemberService;
import com.health.vo.MemberAddVO;
import com.health.vo.MemberVO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 会员管理控制器
 */
@Controller
@RequestMapping("/member")
public class MemberController {

    @Reference(check = false)
    private MemberService memberService;

    /**
     * 跳转到会员档案页面
     * @return
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
    @PostMapping("/members")
    public PageInfo<MemberVO> queryMemebers() {
        PageInfo<MemberVO> memberVOPageInfo = memberService.queryMembers();

        return memberVOPageInfo;
    }

    /**
     * 添加会员信息
     *
     * @param memberAddVO
     * @return
     */
    @PostMapping("/member")
    public ReturnMsg addMemberInfo(MemberAddVO memberAddVO) {
        // 实例化返回结果
        ReturnMsg returnMsg = new ReturnMsg();
        // 添加会员信息
        Boolean flag = memberService.addMember(memberAddVO);
        if (flag) {
            // 设置属性
            returnMsg.setMessgae("添加成功!");
            returnMsg.setFlag(true);
        } else {
            // 设置属性
            returnMsg.setMessgae("添加失败!请检查代码后重试");
            returnMsg.setFlag(false);
        }
        return returnMsg;
    }

    /**
     * 根据主键编号删除会员信息
     *
     * @param id
     * @return
     */
    @DeleteMapping("/member/{id}")
    public ReturnMsg deleteMemberInfo(@PathVariable Integer id) {
        // 实例化返回结果
        ReturnMsg returnMsg = new ReturnMsg();
        // 删除所有会员信息
        Boolean flag = memberService.deleteMemberById(id);
        if (flag) {
            // 设置属性
            returnMsg.setMessgae("删除成功!");
            returnMsg.setFlag(true);
        } else {
            // 设置属性
            returnMsg.setMessgae("删除失败!请检查代码后重试");
            returnMsg.setFlag(false);
        }
        return returnMsg;
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
    public ReturnMsg updateMemberInfo(MemberAddVO memberAddVO) {
        // 实例化返回结果
        ReturnMsg returnMsg = new ReturnMsg();

        // 修改会员信息
        Boolean flag = memberService.updateMemberInfo(memberAddVO);

        if (flag) {
            // 设置属性
            returnMsg.setMessgae("修改成功!");
            returnMsg.setFlag(true);
        } else {
            // 设置属性
            returnMsg.setMessgae("修改失败!请检查代码后重试");
            returnMsg.setFlag(false);
        }
        return returnMsg;
    }

}
