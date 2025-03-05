package com.sumin.section01.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.sumin.section01.aop")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ContextConfiguration {
}
