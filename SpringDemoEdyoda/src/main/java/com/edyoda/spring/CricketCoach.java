package com.edyoda.spring;

import com.edyoda.spring.service.FortuneService;

public class CricketCoach implements Coach {

    private String email;
    private String team;
    private int experience;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

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

    @Override
    public String displayPersonalInfo() {
        return String.format("E-Mail: %s, Team: %s, Exp: %d", email, team, experience);
    }
}
