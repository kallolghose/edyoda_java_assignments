package com.edyoda.myapp;

import com.edyoda.myapp.config.SportConfiguration;
import com.edyoda.myapp.spel.SpelExample;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringConfigDemo {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfiguration.class);
        SpelExample spelExample = context.getBean("spelExample", SpelExample.class);
        System.out.println(spelExample.getAdd());
        System.out.println(spelExample.getMultiplyFromAnotherBean());

    }
}
