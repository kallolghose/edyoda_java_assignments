package com.edyoda.myapp.mycomponents;

import com.edyoda.myapp.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    @Value("${swimcoach.email}")
    private String email;

    @Value("${swimcoach.team}")
    private String team;

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Swim Man !! Swim Man";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String displayPersonalDetails(){
        return String.format("Email : %s, Team : %s", email, team);
    }
}
