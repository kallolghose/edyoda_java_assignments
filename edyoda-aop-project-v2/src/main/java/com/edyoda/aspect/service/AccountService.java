package com.edyoda.aspect.service;

import org.springframework.stereotype.Component;

@Component
public class AccountService {

    public void addAccount(){
        System.out.println(getClass()
                + " - This is add account");
    }

}
