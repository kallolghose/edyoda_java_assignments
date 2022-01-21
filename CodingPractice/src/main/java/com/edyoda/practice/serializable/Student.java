package com.edyoda.practice.serializable;

import java.io.Serializable;

public class Student implements Serializable {

    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void displayName(){
        System.out.println(String.format("Student Class Name : %s %s", firstName, lastName));
    }
}
