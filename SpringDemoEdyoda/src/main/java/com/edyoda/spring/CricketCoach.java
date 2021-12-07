package com.edyoda.spring;

import com.edyoda.spring.service.FortuneService;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    //Constructor Injection
    public CricketCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practive Wicket Keeping for 3 hrs";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
