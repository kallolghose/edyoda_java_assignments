package com.edyoda.spring.annotations.app.carmode;

import org.springframework.stereotype.Component;

@Component
public class SportsMode implements Mode {

    @Override
    public Boolean absOn() {
        return false;
    }

    @Override
    public Integer maxSpeed() {
        return 160;
    }
}
