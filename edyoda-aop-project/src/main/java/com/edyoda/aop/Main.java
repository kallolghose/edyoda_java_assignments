package com.edyoda.aop;

import com.edyoda.aop.config.AOPConfig;
import com.edyoda.aop.dao.AccountDAO;
import com.edyoda.aop.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AOPConfig.class);

        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        accountDAO.addAccount();

        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
        membershipDAO.addAccount();
        membershipDAO.addGymMembership();

        context.close();

    }

}
