package com.edyoda.aspect.dao;

import com.edyoda.aspect.entity.Account;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter
public class AccountDAO {

    private Account account;

    public boolean addAccount(Account account) {
        this.account = account;
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

    public Account updateAccount(String email, String name){
        System.out.println(getClass() + " - Used for updating account");
        this.account.setEmail(email);
        this.account.setName(name);
        return this.account;
    }

}
