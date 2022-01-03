package com.edyoda.springmvcdemo.project;

public class Overriding extends Parent {

    public Overriding(String name){
        super(name);
    }

    @Override
    public String displayMessage(String message) {
        return "Child : " + message;
    }

}
