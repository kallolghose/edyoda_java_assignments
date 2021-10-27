package practice.lessons.abstractclasslessson;

public class MainAbstract {

    public static void main(String[] args) {
        Shape shape = getShapeObject("rectangle");
        System.out.println("Area : " + shape.getArea());
        System.out.println("Perimeter : " + shape.getPerimeter());
    }

    public static Shape getShapeObject(String shapeName){
        Shape childReference;
        if(shapeName.equalsIgnoreCase("circle")){
            childReference = new Circle("RED", 3);
        }
        else {
            childReference = new Rectangle("BLACK", 10, 20);
        }
        return childReference;
    }
}
