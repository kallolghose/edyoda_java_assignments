package com.edyoda.classroom;

public class Curriculum {

    private int noOfQuestions = 20;

    //Function
    //Member Function
    //Method
    public void createTest(){
        System.out.println("Create Test");
        createAnswerKey();
        noOfQuestions = noOfQuestions + 1;

        Planner planner = new Planner();
        planner.createTopic();
        planner.numberOfTopics = 10;
        planner.createPlanner();
    }

    private void createAnswerKey(){
        System.out.println("Private Create Answer Key");
    }

}
