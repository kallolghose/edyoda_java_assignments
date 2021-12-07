package com.edyoda.spring;

import com.edyoda.spring.service.FortuneService;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Practice Batting for 1 hr";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
