package com.edyoda.aspect.myaspects;

import com.edyoda.aspect.entity.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)

public class LoggingAspect {

    /*
     * I do not want to execute the Before Advice (beforeLoggingForDAOPackage)\\
     * if the functions are getters and setters
     */

    @Pointcut("execution(* com.edyoda.aspect.dao.*.*(..))")
    public void pcForDAOPackage() {
    }

    @Pointcut("execution(* com.edyoda.aspect.dao.*.get*(..))")
    public void pcForGetters() {
    }

    @Pointcut("execution(* com.edyoda.aspect.dao.*.set*(..))")
    public void pcForSetters() {
    }

    //Execute the Advice before any method in any class in DAO package
    //execution(modifiers-pattern? Return-type-pattern declaring-type-pattern?  Method-name-pattern(param-pattern) throws-pattern?)
    //The Before Advice in the Logging Aspect wants to know the Signature (later parameters) of the functions which
    //has invoked the advice
    @Before("pcForDAOPackage() && !(pcForGetters() || pcForSetters())")
    public void beforeLoggingForDAOPackage(JoinPoint joinPoint) {
        System.out.println(":::: This is a logging aspect ::::");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Function Name : " + methodSignature.getName());
        System.out.println("Param (Size) : " + joinPoint.getArgs().length);
        for(Object object : joinPoint.getArgs()){
            if(object instanceof Account) {
                System.out.println("Get an account object");
            }
        }
    }

    @AfterReturning(pointcut = "pcForDAOPackage() && !(pcForGetters() || pcForSetters())", returning = "result")
    public void afterSuccessfulReturn(JoinPoint joinPoint, Object result){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("#### After Returning From : " + methodSignature.getName() + " ####");
        System.out.println("#### Result " + result);
    }



}
