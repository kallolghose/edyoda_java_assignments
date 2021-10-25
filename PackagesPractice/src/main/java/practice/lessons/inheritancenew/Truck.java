package practice.lessons.inheritancenew;

import practice.lessons.inheritancelesson.Vehicle;

//Truck is my sub-class or child-class
public class Truck extends Vehicle {

    //Protected properties when inherited they become private in the child class

    public Truck(int wheels, int gears, int speed) {
        super(wheels, gears, speed);
    }

    public void justAnotherFunc(){
        setAutomatic(true);
        isAutomatic = true;
    }

    private void somePrivateFunction(){

    }
}
