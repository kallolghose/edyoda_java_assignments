package practice.lessons.abstractclasslessson;

public class Baleno extends Car {

    @Override
    public void performAcceleration() {
        System.out.println("It is a diesel acceleration");
    }

    @Override
    public void performBraking() {
        System.out.println("It is a diesel braking");
    }
}
