package com.beto.test.jsf.config.spring.controller;

import org.springframework.stereotype.Component;

/**
 * Created by BeytullahCaliskan on 29.09.2014.
 */
@Component
public class SpringBean {

    public String testMethod(String name){
        return name +", SPRING AND JSF CONFIGURATIONS SUCCESS :)";
    }

}
