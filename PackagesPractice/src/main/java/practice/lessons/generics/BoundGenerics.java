package practice.lessons.generics;


import practice.lessons.inheritancelesson.Vehicle;

//T -> Vehicle or Subclass of Vehicle (Bike, Car, AutoRikshaw)
//Bounded Generics
public class BoundGenerics<T extends Vehicle> {

    private T vehicle;

    public BoundGenerics(T vehicle){
        this.vehicle = vehicle;
    }

    public T getVehicle() {
        return vehicle;
    }
}
