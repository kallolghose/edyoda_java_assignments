package practice.lessons.inheritancenew;

import practice.lessons.inheritancelesson.Car;

public class UtilityVehicles extends Car { //Cannot Extend Final Class Within same package or across package

    public UtilityVehicles(int wheels, int gears, int speed){
        super(wheels, gears, speed);
    }

    public boolean is4WheelDrive;

    public void setIs4WheelDrive(boolean is4WheelDrive){
        this.is4WheelDrive = is4WheelDrive;
    }

    @Override
    public String displayProperties(){
        return "";
    }
}
