package com.ghoseka.aspect.myaspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
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

    @AfterReturning(pointcut = "", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result){

    }

    @AfterThrowing(pointcut = "", throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint, Throwable ex){

    }



}
