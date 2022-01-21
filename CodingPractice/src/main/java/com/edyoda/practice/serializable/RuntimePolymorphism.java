package com.edyoda.practice.serializable;

public class RuntimePolymorphism {

    public static void main(String[] args) {
        Student student = new Student("Fname", "LName");
        ScienceStudent scienceStudent = new ScienceStudent("SFName", "SLName");

        student = scienceStudent;

        student.displayName();

        //1. Student Class Name : FName LName
        //2. ScienceStudent Class Name : SFName, SLName

    }
}
