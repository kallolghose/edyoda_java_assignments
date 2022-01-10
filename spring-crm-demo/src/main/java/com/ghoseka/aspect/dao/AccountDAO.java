package com.ghoseka.aspect.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    private String name;

    public void addAccount(String accountNumber){
        System.out.println(getClass() + " : Some DB Work");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
