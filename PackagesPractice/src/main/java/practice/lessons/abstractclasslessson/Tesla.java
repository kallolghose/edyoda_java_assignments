package practice.lessons.abstractclasslessson;

public class Tesla extends Car {

    @Override
    public void performAcceleration() {
        System.out.println("Its an electric acceleration");
    }

    @Override
    public void performBraking() {
        System.out.println("Its an electric braking");
    }
}
