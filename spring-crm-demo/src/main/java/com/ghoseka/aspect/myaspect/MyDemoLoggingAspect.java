package com.ghoseka.aspect.myaspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyDemoLoggingAspect {

    @Before("execution(public void addAccount())")
    public void beforeAddAccount(){
        System.out.println("Before Adding Account");
    }

}
