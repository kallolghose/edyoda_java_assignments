package practice.lessons.inheritancelesson;

public class MainInheritance {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(5, 4, 100);
        System.out.println(vehicle.displayProperties());


        Car maruti800 = new Car(4, 5, 120);
        maruti800.setSunRoofAvailable(true);
        System.out.println("Maruti : " + maruti800.displayProperties());
    }

}
