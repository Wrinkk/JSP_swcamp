package com.ohgiraffers.section01.autowired.subsection02.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {


        ApplicationContext context
                = new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        /* 설명. subsection01에 있는 BookService 타입의 bean과 혼선을 방지하고자 bean 이름(id) 수정 */
        BookService bookservice = context.getBean("bookServiceConstructor", BookService.class);

        bookservice.findAllBook().forEach(System.out::println);

        System.out.println(bookservice.searchBookBySequence(1));
        System.out.println(bookservice.searchBookBySequence(2));
    }
}
