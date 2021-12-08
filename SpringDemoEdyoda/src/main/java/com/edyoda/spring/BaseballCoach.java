package com.edyoda.spring;

import com.edyoda.spring.service.FortuneService;

public class BaseballCoach implements Coach {

    //We will be using setter injection
    private String email;
    private String team;
    private int experience;

    public void initMethod(){
        System.out.println("In Init Method");
    }

    public void destroyMethod(){
        System.out.println("In Destroy Method");
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }


    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    public int getExperience() {
        return experience;
    }

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

    @Override
    public String displayPersonalInfo() {
        return String.format("E-Mail: %s, Team: %s, Exp: %d", email, team, experience);
    }
}
