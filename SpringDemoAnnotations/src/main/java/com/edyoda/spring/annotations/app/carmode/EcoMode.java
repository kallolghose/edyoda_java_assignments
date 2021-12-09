package com.edyoda.spring.annotations.app.carmode;

import org.springframework.stereotype.Component;

@Component
public class EcoMode implements Mode {

    @Override
    public Boolean absOn() {
        return true;
    }

    @Override
    public Integer maxSpeed() {
        return 80;
    }
}
