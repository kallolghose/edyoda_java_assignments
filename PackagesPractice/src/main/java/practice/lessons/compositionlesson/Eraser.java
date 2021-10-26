package practice.lessons.compositionlesson;

public class Eraser {

    private String brand;
    private String color;

    public Eraser(String b, String c){
        brand = b;
        color = c;
    }

    public String getBrand(){
        return brand;
    }

    public String getColor(){
        return color;
    }

}
