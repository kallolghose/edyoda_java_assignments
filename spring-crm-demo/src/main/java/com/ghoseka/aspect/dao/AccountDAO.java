package com.ghoseka.aspect.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount(){
        System.out.println(getClass() + " : Some DB Work");
    }

}
