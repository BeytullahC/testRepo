package com.beto.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by BeytullahCaliskan on 29.09.2014.
 */
public class tester {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        SpringBean bean = context.getBean(SpringBean.class);
        System.out.println(bean.test("BETO"));
    }
}
