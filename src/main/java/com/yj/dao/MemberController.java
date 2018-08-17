package com.yj.dao;

import com.yj.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @RequestMapping("showMember")
    @ResponseBody
    public Member toIndex(HttpServletRequest request, HttpServletResponse response){
        int userId=Integer.parseInt(request.getParameter("id"));
        Member member=memberService.getMemberById(userId);
        return member;
    }
}
