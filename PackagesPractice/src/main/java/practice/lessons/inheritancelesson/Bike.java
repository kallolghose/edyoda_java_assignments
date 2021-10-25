package practice.lessons.inheritancelesson;

//Child Class | Sub Class
//Bike IS A Child of Vehicle
public class Bike extends Vehicle {

    public Bike(int wheels, int gears, int speed){
        super(wheels, gears, speed);
    }

    public boolean isPillionAvailable;

    public void setPillionAvailable(boolean isAvailable){
        isPillionAvailable = isAvailable;
    }
}
