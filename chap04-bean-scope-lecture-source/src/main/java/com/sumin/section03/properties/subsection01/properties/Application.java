package com.sumin.section03.properties.subsection01.properties;

import com.sumin.common.Beverage;
import com.sumin.common.Bread;
import com.sumin.common.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);

        Product carpBread = context.getBean("carpBread", Bread.class);
        Product milk = context.getBean("milk", Beverage.class);

        System.out.println("carpBread = " + carpBread);
        System.out.println("milk = " + milk);

    }
}