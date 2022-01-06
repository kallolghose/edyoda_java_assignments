package com.edyoda.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    public void addAccount(){
        System.out.println(getClass() + " Add Account");
    }

    public Boolean addGymMembership(){
        System.out.println(getClass() + " Add Gym Membership");
        return Boolean.TRUE;
    }

}
