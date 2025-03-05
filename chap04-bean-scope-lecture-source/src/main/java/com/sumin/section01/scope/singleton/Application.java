package com.sumin.section01.scope.singleton;

import com.sumin.common.Beverage;
import com.sumin.common.Bread;
import com.sumin.common.Product;
import com.sumin.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println("beanName: " + beanName);
        }

        /* 설명. 붕어빵, 딸기우유, 지리산 암반수를 진열 */
        Product carpBread = context.getBean("carpBread", Bread.class);
        Product milk = context.getBean("milk", Beverage.class);
        Product water = context.getBean("water", Beverage.class);

        /* 설명. 첫 번째 손님이 입장해서 쇼핑카트를 꺼내 물건을 담는다. */
        ShoppingCart cart1 =  context.getBean("cart", ShoppingCart.class);
        cart1.addItem(carpBread);
        cart1.addItem(milk);

        System.out.println("첫 번째 손님의 카트: " + cart1);

        /* 설명. 두 번째 손님이 입장해서 쇼핑카트를 꺼내 물건을 담는다. */
        ShoppingCart cart2 = context.getBean("cart", ShoppingCart.class);

        /* 설명. 두 번째 손님의 쇼핑 카트에 물품 담고 확인 */
        cart2.addItem(water);
        System.out.println("두 번째 손님의 카트: " + cart2);
    }
}
