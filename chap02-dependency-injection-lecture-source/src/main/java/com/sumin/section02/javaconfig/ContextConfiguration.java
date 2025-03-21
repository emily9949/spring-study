package com.sumin.section02.javaconfig;

import com.sumin.common.Account;
import com.sumin.common.MemberDTO;
import com.sumin.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public Account accountGenerator() {
        return new PersonalAccount(20, "110-234-4567890");
    }

    @Bean
    public MemberDTO memberGenerator() {

        /* 설명. setter 주입 */
        MemberDTO member = new MemberDTO();
        member.setSequence(1);
        member.setName("홍길동");
        member.setEmail("hong@gmail.com");
        member.setPersonalAccount(accountGenerator());

//        return member;

        /* 설명. 생성자 주입 */
       return new MemberDTO(1, "홍길동", "010-234-5678", "hong@gmail.com", accountGenerator());
    }
}
