package com.sumin.section01.autowired.subsection3.constructor;

import com.sumin.section01.autowired.subsection01.field.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.sumin.section01.autowired.subsection3.constructor");

        BookService bookService = context.getBean("bookServiceConstructor", BookService.class);
        bookService.findAllBook().forEach(System.out::println);
        System.out.println("2번 책: " + bookService.findBookBySequence(2));

    }
}
