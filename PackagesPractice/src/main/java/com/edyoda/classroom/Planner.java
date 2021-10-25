package com.edyoda.classroom;

//M1 + M2
public class Planner {

    //Default
    protected int numberOfTopics = 10; //Some Memory M1 (Size)
    private int noOfClasses = 10; //Some Memory M2 (Size)

    //Default
    protected void createTopic(){
        System.out.println("Create Topic");
    }

    public void createPlanner(){
        System.out.println("Create Planner");
    }
}
