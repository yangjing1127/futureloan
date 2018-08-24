//package com.yj.service;
//
//import com.yj.dao.Member;
//import com.yj.dao.MemberMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class MemberServiceImpl implements MemberService {
//
//    @Autowired
//    private MemberMapper memberDao;
//
//    @Override
//    public Member getMemberById(int userId) {
//        Member member=memberDao.selectByPrimaryKey(userId);
//        return member;
//    }
//
//    @Override
//    public boolean addMember(Member member) {
//        boolean result=false;
//        try
//        {
////            memberDao.insertSelective(member);
//            result=true;
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return result;
//    }
//}
