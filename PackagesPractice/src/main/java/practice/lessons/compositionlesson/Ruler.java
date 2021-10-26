package practice.lessons.compositionlesson;

public class Ruler {

    private int length;
    private String unit;

    public Ruler(int length, String unit){
        this.length = length;
        this.unit = unit;
    }

    public String getUnit(){
        return this.unit;
    }

    public int getLength(){
        return this.length;
    }

}
