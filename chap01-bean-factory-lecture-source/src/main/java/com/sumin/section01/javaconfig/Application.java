package com.sumin.section01.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] beanNames = context.getBeanDefinitionNames(); // 컨테이너 안에 있는 콩들을 배열에 담음
        for (String beanName : beanNames) {
            System.out.println("beanName = " + beanName);
        }
    }
}
