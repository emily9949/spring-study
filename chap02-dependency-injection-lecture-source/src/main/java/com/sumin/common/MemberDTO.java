package com.sumin.common;

import lombok.*;

// bean 생성 시 setter 방식으로 주입할 수도 있음. 그렇기 때문에 getter/setter 를 불러와야하는 것.
// setter 를 사용하게 되면 캡슐화가 의미없기 때문에 setter 지양.
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class MemberDTO {
    private int sequence;
    private String name;
    private String phone;
    private String email;
    private Account personalAccount;   // 개인 계좌
}
