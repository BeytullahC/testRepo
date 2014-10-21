package com.beto.test.spring;

import org.springframework.stereotype.Component;

/**
 * Created by BeytullahCaliskan on 29.09.2014.
 */

@Component
public class SpringBean {

    public String test(String name){
        return name+" Welcome to Spring context :)";
    }
}
