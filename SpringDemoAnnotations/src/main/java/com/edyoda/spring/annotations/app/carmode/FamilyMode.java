package com.edyoda.spring.annotations.app.carmode;

public class FamilyMode implements Mode {

    @Override
    public Boolean absOn() {
        return true;
    }

    @Override
    public Integer maxSpeed() {
        return 60;
    }
}
