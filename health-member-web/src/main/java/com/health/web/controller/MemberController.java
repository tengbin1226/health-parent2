package com.health.web.controller;

import com.github.pagehelper.PageInfo;
import com.health.service.MemberService;
import com.health.vo.MemberVO;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 会员管理控制器
 */
@RestController
@RequestMapping("/member")
public class MemberController {

    @Reference
    private MemberService memberService;

    /**
     * 分页查询会员信息
     * @return
     */
    @GetMapping("/members")
    public List<MemberVO> queryMemebers(){
        PageInfo<MemberVO> memberVOPageInfo = memberService.queryMembers();
        return  memberVOPageInfo.getList();
    }

}
