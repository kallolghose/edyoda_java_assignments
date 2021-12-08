package com.edyoda.myapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMyApp {

    public static void main(String[] args) {
        //Load the Configuration Class
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Retrieve bean
        BaseballCoach theCoach = context.getBean("myCoach", BaseballCoach.class);
        //call method
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());
        //close context
        context.close();
    }
}
