package com.sumin.common;

/* 설명. Spring에서는 유지보수의 편리성을 위해 인터페이스에 의존하는 구조로 만든다. (PSA) */
public interface Account {

    /* 설명. 잔액 조회 */
    String getBalance();

    /* 설명. 입금 */
    String deposit(int money);

    /* 설명. 출금 */
    String withdraw(int money);
}
