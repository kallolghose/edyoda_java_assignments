package practice.lessons.generics;

import practice.lessons.inheritancelesson.Bike;
import practice.lessons.inheritancelesson.Car;
import practice.lessons.inheritancelesson.Vehicle;

public class BoundGenericsMain {

    public static void main(String[] args) {
        //BoundGenerics<String> stringBoundGenerics = new BoundGenerics<>("Hello");
        //BoundGenerics<Integer> integerBoundGenerics = new BoundGenerics<>(10);

        BoundGenerics<Vehicle> vehicleBoundGenerics = new BoundGenerics<>(new Vehicle(4,4,4));
        BoundGenerics<Car> carBoundGenerics = new BoundGenerics<>(new Car(4,4,4));
        BoundGenerics<Bike> bikeBoundGenerics = new BoundGenerics<>(new Bike(4,4,4));
    }
}
