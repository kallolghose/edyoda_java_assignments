package practice.lessons.abstractclasslessson;

import practice.lessons.compositionlesson.Eraser;

//Abstract class can have 0 or more abstract methods
public abstract class Shape {

    //Abstract
    //1. It does not have a definition/body
    public abstract double getArea();
    public abstract double getPerimeter();

    private String color;

    public Shape(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

}
