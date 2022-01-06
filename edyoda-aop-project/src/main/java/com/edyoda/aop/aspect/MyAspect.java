package com.edyoda.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Before("execution(* add*())") //PointCut Expression
    public void beforeAddAccount(){
        System.out.println(":::: Before Advice is being called ::::");
    }

}
