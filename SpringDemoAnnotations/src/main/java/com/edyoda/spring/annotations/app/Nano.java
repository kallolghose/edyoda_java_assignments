package com.edyoda.spring.annotations.app;

import com.edyoda.spring.annotations.app.carmode.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Nano implements Vehicle {

    @Value("${nano.manufacturedin}")
    private String manufacturedIn;

    @Value("${nano.cost}")
    private Double cost;

    public String getAdditionalDetails(){
        return String.format("Manufactured In %s, Cost %f", manufacturedIn, cost);
    }

    @Autowired
    @Qualifier("familyMode")
    private Mode mode;

    @Override
    public String getModel() {
        return "2-Stroke";
    }

    @Override
    public Integer getEnginePower() {
        return 500;
    }

    @Override
    public Integer getWheels() {
        return 4;
    }

    @Override
    public Integer getTopSpeed() {
        return mode.maxSpeed();
    }
}
