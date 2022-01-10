package com.ghoseka.aspect.myaspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyDemoLoggingAspect {

    @Pointcut("execution(* com.ghoseka.aspect.dao.*.*(..))")
    public void forDAOPackage(){}

    @Pointcut("execution(* com.ghoseka.aspect.dao.*.get*(..))")
    public void getter(){}

    @Pointcut("execution(* com.ghoseka.aspect.dao.*.set*(..))")
    public void setter(){}

    @Before("forDAOPackage() && !(getter() || setter())")
    public void beforeAddAccount(JoinPoint joinPoint){
        System.out.println("Before Adding Account");

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method Signature : " + methodSignature);

        for(Object str : joinPoint.getArgs()){
            System.out.println(str);
        }

    }

}
