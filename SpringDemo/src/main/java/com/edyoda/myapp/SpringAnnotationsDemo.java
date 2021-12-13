package com.edyoda.myapp;

import com.edyoda.myapp.mycomponents.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationsDemo {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-annotations.xml");
        Coach coach = context.getBean("tennisCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        context.close();
    }
}
