package com.edyoda.springmvcdemo.project;

public class Parent {

    private String name;

    public Parent(String name){
        this.name = name;
    }

    public String displayMessage(String message){
        return "Parent : " + message;
    }

}
