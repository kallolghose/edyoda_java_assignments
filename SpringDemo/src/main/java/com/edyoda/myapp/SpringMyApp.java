package com.edyoda.myapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMyApp {

    public static void main(String[] args) {
        //Load the Configuration Class
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Retrieve bean
        Coach theCoach = context.getBean("myCoach", Coach.class);
        //call method
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        //close context
        context.close();
    }
}
