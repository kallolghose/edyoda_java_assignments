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










    //Private data members are NOT inherited either within or across package
    private String name;

    //Default
    //Inherited within same package
    //NOT inherited across packages
    String color;

    //Inherited within same package
    //Inherited across different package
    protected boolean isAutomatic;



    //Private Modifiers are NOT inherited either within or across package
    private void setName(String n){
        name = n;
    }

    //Default
    //Inherited within same package
    //NOT inherited across packages
    void setColor(String c){
        color = c;
    }

    //Inherited within same package
    //Inherited across different package
    //Object can access protected members/properties within same package
    //Object CANNOT access protected members/properties across different package
    protected void setAutomatic(boolean isAut){
        isAutomatic = isAut;
    }

    //It can be inherited everywhere
    //Within Same package
    //Across Packages
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

    //Parent Class
    public String displayProperties(){
        return "Parent : Wheels : " + this.wheels + ", Gears : " + this.gears + ", Speed : " + this.speed;
    }

    protected int sum(int a, int b){
        return a + b;
    }

    //Final keyword will prevent overriding
    public final String cannotOverride(){
        return "Cannot Override";
    }

}
