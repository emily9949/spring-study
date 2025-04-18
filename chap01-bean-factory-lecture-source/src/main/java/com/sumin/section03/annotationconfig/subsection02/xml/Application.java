package com.sumin.section03.annotationconfig.subsection02.xml;

import com.sumin.section03.annotationconfig.subsection01.java.ContextConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("section03/annotationconfig/xml/spring-context.xml");

        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println("beanName: " + beanName);
        }
    }
}
