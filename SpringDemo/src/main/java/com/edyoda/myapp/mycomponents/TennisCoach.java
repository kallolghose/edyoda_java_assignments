package com.edyoda.myapp.mycomponents;

import com.edyoda.myapp.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach{

    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Tennis";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }

}
