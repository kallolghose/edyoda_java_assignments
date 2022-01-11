package com.edyoda.aspect.dao;

import com.edyoda.aspect.entity.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    private Account account;

    public boolean addAccount(Account account) {
        System.out.println(getClass() +
                " - This is used for adding account");
        if(account == null){
            System.out.println("Please enter Account");
            return false;
        }
        else{
            System.out.println("Account Email : " + account.getEmail());
            return true;
        }
    }

}
