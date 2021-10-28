package practice.lessons.abstractclasslessson;

public class Dealer {

    public static void main(String[] args) {
        Car car = getCar("baleno");
        car.performAcceleration();
        car.performBraking();
    }

    public static Car getCar(String carName){
        Car carReference = null;
        if(carName.equalsIgnoreCase("tesla")){
            carReference = new Tesla();
        }
        else if(carName.equalsIgnoreCase("baleno")){
            carReference = new Baleno();
        }
        return carReference;
    }
}
