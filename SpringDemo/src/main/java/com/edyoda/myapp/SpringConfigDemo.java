package com.edyoda.myapp;

import com.edyoda.myapp.config.SportConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringConfigDemo {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfiguration.class);
        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.displayPersonalDetails());
    }
}
