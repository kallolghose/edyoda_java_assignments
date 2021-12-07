package com.edyoda.myapp;

import com.edyoda.myapp.service.FortuneService;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 mins on batting";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
