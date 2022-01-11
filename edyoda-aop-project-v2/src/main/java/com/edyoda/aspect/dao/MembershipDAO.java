package com.edyoda.aspect.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    private String card;

    public void addMembership(){
        System.out.println(getClass() + " - This is adding membership.");
    }

    public void membershipPackage(String card){
        this.card = card;
        System.out.println(getClass() + " - Membership Package");
    }

}
