package com.edyoda.myapp;

import com.edyoda.myapp.service.FortuneService;

public class FootballCoach implements Coach{

    private FortuneService fortuneService;

    public FootballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do defensive play";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
