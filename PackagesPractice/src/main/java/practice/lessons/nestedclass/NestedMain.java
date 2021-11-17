package practice.lessons.nestedclass;

public class NestedMain {

    public static void main(String[] args) {
        //Local Inner Class
        Outer outer = new Outer();
        new Outer().printOuter();

//        Outer.Inner inner = outer.new Inner();
//        inner.printInner();
//
//        //Static Nested Class
//        StaticNestedClass.InnerStaticClass innerStaticClass =
//                new StaticNestedClass.InnerStaticClass();
//        innerStaticClass.print();
    }

}
