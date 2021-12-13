package com.edyoda.spring.annotations.app;

import com.edyoda.spring.annotations.app.carmode.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class FordCar implements Vehicle {

    @Autowired
    @Qualifier("sportsMode")
    private Mode mode;

//    @Autowired
//    public FordCar(@Qualifier("sportsMode") Mode mode){
//        this.mode = mode;
//    }

//    @Autowired
//    @Qualifier("sportsMode")
//    public void setMode(Mode mode) {
//        this.mode = mode;
//    }

    @Override
    public String getModel() {
        return "Mustang";
    }

    @Override
    public Integer getEnginePower() {
        return 10000;
    }

    @Override
    public Integer getWheels() {
        return 4;
    }

    @Override
    public Integer getTopSpeed() {
        return this.mode.maxSpeed();
    }
}
