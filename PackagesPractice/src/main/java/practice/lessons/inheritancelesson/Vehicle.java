package practice.lessons.inheritancelesson;

import com.edyoda.classroom.Curriculum;

//Parent Class | Base Class
public class Vehicle {

    public int wheels;
    public int gears;
    public int speed;

    //Constructor is never inherited
    public Vehicle(int wheels, int gears, int speed){
        this.wheels = wheels;
        this.gears = gears;
        this.speed = speed;
    }

    public void setWheels(int numberOfWheels){
        wheels = numberOfWheels;
    }

    public void increaseSpeed(int inc){
        speed = speed + inc;
    }

    public void decreaseSpeed(int dec){
        speed = speed - dec;
    }

    public void upShiftGear(){
        gears = gears + 1;
    }

    public void downShiftGear(){
        System.out.println("Down Shifting Gear");
        gears = gears - 1;
    }

    public String displayProperties(){
        return "Parent : Wheels : " + this.wheels + ", Gears : " + this.gears + ", Speed : " + this.speed;
    }

}
