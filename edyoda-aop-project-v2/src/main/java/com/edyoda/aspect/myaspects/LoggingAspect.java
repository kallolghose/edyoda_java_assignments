package com.edyoda.aspect.myaspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    //Execute the Advice before any method in any class in DAO package
    @Before("execution(* com.edyoda.aspect.dao.*.*(..))")
    public void beforeAdviceForDAOPackage(){
        System.out.println(":::: BEFORE ADD ACCOUNT ::::");
    }

}
