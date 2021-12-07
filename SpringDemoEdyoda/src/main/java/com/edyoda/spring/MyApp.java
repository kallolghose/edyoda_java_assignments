package com.edyoda.spring;

import com.edyoda.spring.service.SadFortune;

public class MyApp {

    public static void main(String[] args) {
        Coach coach = new BaseballCoach(new SadFortune());
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
    }

}
