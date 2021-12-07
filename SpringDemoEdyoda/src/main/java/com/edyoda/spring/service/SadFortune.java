package com.edyoda.spring.service;

public class SadFortune implements FortuneService {

    @Override
    public String getFortune() {
        return "Sad Fortune";
    }
}
