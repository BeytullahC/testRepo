package com.beto.test.controller;

import com.beto.test.model.dao.ilDao;
import com.beto.test.model.entity.Il;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.List;

/**
 * Created by BeytullahCaliskan on 30.09.2014.
 */

@Component
@ManagedBean
@RequestScoped
public class indexController {
    
    @Autowired
    private ilDao dao;

    private List<Il> ilList;

    @PostConstruct
    public void init(){

        try {
           ilList = dao.selectIlList();
        }catch (Exception e){
            ilList=null;
            e.printStackTrace(System.err);
        }
    }

    public List<Il> getIlList() {
        return ilList;
    }

    public void setIlList(List<Il> ilList) {
        this.ilList = ilList;
    }
}
