package com.sumin.common;

/* 설명. 코드를 어노테이션으로 대체*/
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class MemberDTO {
    private int sequence;
    private String id;
    private String pwd;
    private String name;

}
