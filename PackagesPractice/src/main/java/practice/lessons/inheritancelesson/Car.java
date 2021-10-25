package practice.lessons.inheritancelesson;

//Child Class | Sub Class
/*

INHERITANCE IS CALLED IS-A Type of Relation

Car IS-A child of Vehicle

 */
public class Car extends Vehicle {

    public Car(int wheels, int gears, int speed) {
        super(wheels, gears, speed);
    }

    public boolean isSunRoofAvailable; //data members

    public void setSunRoofAvailable(boolean isAvailable) {
        isSunRoofAvailable = isAvailable;
        System.out.println(displayProperties());
        setAutomatic(true);
        isAutomatic = true;
    }

    @Override
    public String displayProperties() {
        System.out.print("CAR ---> ");
        return "Sun Roof : " + this.isSunRoofAvailable + super.displayProperties();
    }

    @Override
    public int sum(int a, int b){
        return a + b;
    }

}
