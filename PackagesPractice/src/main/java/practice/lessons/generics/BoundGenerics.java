package practice.lessons.generics;


import practice.lessons.inheritancelesson.Bike;
import practice.lessons.inheritancelesson.Car;
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

    public static void main(String[] args) {
        //BoundGenerics<String> stringBoundGenerics = new BoundGenerics<>("Hello");
        //BoundGenerics<Integer> integerBoundGenerics = new BoundGenerics<>(10);

        BoundGenerics<Vehicle> vehicleBoundGenerics = new BoundGenerics<>(new Vehicle(4,4,4));
        BoundGenerics<Car> carBoundGenerics = new BoundGenerics<>(new Car(4,4,4));
        BoundGenerics<Bike> bikeBoundGenerics = new BoundGenerics<>(new Bike(4,4,4));
    }
}
