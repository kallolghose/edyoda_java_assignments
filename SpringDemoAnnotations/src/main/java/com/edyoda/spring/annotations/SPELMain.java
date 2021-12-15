package com.edyoda.spring.annotations;

import com.edyoda.spring.annotations.config.SpringConfiguration;
import com.edyoda.spring.annotations.spelpackage.SpelExample;
import com.edyoda.spring.annotations.spelpackage.SpelListAndMap;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SPELMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        SpelExample spelExample = context.getBean("spelExample", SpelExample.class);
//        System.out.println(spelExample.getAdd());
//        System.out.println(spelExample.getDivide());
//        System.out.println(spelExample.getGreaterThan100());
//        System.out.println(spelExample.getLogicalOperation());
//        System.out.println("getCheckSpelComponentValueGt1000 : " + spelExample.getCheckSpelComponentValueGt1000());
//        System.out.println(spelExample.getCompanyName());

        SpelListAndMap spelListAndMap = context.getBean("SpelListAndMap", SpelListAndMap.class);
        System.out.println(spelListAndMap.getJohnSalary());
        System.out.println(spelListAndMap.getFirstWorker());

        context.close();
    }
}
