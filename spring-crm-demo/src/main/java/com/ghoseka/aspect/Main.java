package com.ghoseka.aspect;

import com.ghoseka.aspect.config.AspectConfig;
import com.ghoseka.aspect.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AspectConfig.class);
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        accountDAO.addAccount("1XXXX");
        accountDAO.setName("Kallol");
        System.out.println(accountDAO.getName());
        context.close();
    }

}
