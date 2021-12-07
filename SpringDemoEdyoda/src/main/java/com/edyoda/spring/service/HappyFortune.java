package com.edyoda.spring.service;

public class HappyFortune implements FortuneService {

    @Override
    public String getFortune() {
        return "Happy Day !!";
    }
}
