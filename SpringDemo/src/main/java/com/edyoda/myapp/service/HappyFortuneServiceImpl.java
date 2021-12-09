package com.edyoda.myapp.service;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneServiceImpl implements FortuneService {

    @Override
    public String getFortune() {
        return "Good Fortune";
    }
}
