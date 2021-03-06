package com.edyoda.aspect;

import com.edyoda.aspect.config.AspectConfig;
import com.edyoda.aspect.dao.AccountDAO;
import com.edyoda.aspect.dao.MembershipDAO;
import com.edyoda.aspect.entity.Account;
import com.edyoda.aspect.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AspectConfig.class);

        System.out.println("=== ADD ACCOUNT ===");
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        accountDAO.addAccount(new Account("Kallol@gmail.com", "Ghose"));
        accountDAO.updateAccount("K", "G");


//        System.out.println("\n=== GET ACCOUNT ===");
//        Account account = accountDAO.getAccount();
//
//        System.out.println("\n=== SET ACCOUNT ===");
//        accountDAO.setAccount(account);
//
//        System.out.println("=== DISPLAY ACCOUNT ====");
//        System.out.println(account.getEmail());

//        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
//        membershipDAO.addMembership();
//        membershipDAO.membershipPackage("GOLD");
//
//        System.out.println("\n\n========= SERVICE LAYER =============\n");
//        AccountService accountService = context.getBean("accountService", AccountService.class);
//        accountService.addAccount();
    }
}
