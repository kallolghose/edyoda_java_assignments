package com.edyoda.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BaseballCoach coach1 = context.getBean("myCoach", BaseballCoach.class);
        System.out.println(coach1.getDailyWorkout());
        System.out.println(coach1.getDailyFortune());
        System.out.println(coach1.displayPersonalInfo());
        coach1.setExperience(20);
        System.out.println("Coach 1 Experience : " + coach1.getExperience());

        BaseballCoach coach2 = context.getBean("myCoach", BaseballCoach.class);
        System.out.println("Coach 2 Experience : " + coach2.getExperience());
        context.close();
    }
}
