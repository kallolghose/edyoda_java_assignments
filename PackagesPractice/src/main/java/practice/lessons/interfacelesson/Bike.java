package practice.lessons.interfacelesson;

public class Bike implements Vehicle {

    @Override
    public void changeGear(int delta) {
        System.out.println("Changed Gear");
    }

    @Override
    public void turnLight(boolean onOff) {
        System.out.println("Turned Light");
    }

    @Override
    public void makeTurn(String direction) {
        System.out.println("Changed Direction");
    }
}
