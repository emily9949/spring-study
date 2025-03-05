package com.sumin.section01.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    private final MemberDAO memberDAO;

    @Autowired
    public MemberService(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    public List<MemberDTO> findAllMembers() {
        System.out.println("target -> findALlmembers 실행");
        return memberDAO.selectAllMembers();
    }

    public MemberDTO findMemberBy(int index) {
        System.out.println("target -> findMemberBy 실행  ");
        return memberDAO.selectMemberBy(index);
    }


}
