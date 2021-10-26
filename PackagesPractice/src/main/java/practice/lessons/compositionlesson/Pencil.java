package practice.lessons.compositionlesson;

public class Pencil {

    private String type;
    private String brand;

    public Pencil(String b, String t){
        brand = b;
        type = t;
    }

    public String getBrand(){
        return brand;
    }

    public String getType(){
        return type;
    }

}
