package practice.lessons.abstractclasslessson;

public class Rectangle extends Shape {

    private double length;
    private double breadth;

    public Rectangle(String color, double length, double breadth){
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double getArea() {
        return length * breadth;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + breadth);
    }
}
