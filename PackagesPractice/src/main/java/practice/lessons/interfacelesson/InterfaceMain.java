package practice.lessons.interfacelesson;

public class InterfaceMain {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.turnLight(true);
        bike.makeTurn("Right");
        bike.changeGear(1);
    }
}
