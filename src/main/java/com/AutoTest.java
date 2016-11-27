package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoTest {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        Auto auto = context.getBean("auto", Auto.class);

        System.out.println(auto);
    }
}
