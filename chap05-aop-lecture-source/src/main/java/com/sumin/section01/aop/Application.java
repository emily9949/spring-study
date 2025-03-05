package com.sumin.section01.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        MemberService memberService =  context.getBean("memberService", MemberService.class);
        System.out.println("회원 조회: " + memberService.findAllMembers());
        System.out.println("회원 조회: ");
        memberService.findAllMembers().forEach(System.out::println);


        System.out.println(memberService.findMemberBy(1));
    }
}
