package com.beto.tester.jsf.config.spring.controller.controller;

import com.beto.test.jsf.config.spring.controller.SpringBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by BeytullahCaliskan on 29.09.2014.
 */
@Component
@ManagedBean
@RequestScoped
public class testController {
    @Autowired
    private SpringBean springBean;

    private String name;

    @PostConstruct
    public void init() {
        try {
            name = springBean.testMethod("BETO");
        } catch (Exception e) {
            name = e.getMessage();
            e.printStackTrace(System.err);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
