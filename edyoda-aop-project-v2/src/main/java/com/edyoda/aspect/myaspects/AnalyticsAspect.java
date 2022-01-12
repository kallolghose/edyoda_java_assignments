package com.edyoda.aspect.myaspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class AnalyticsAspect {

    @Before("com.edyoda.aspect.myaspects.LoggingAspect.pcForDAOPackage()")
    public void beforeAnalyticsForDAOPackage(){
        System.out.println(":::: This is an analytics aspect ::::");
    }

}
