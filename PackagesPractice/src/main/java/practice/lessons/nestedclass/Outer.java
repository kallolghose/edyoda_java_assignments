package practice.lessons.nestedclass;

public class Outer {

    // static member
    static int outer_x = 10;

    // instance(non-static) member
    int outer_y = 20;

    // private member
    private int outer_private = 30;

    public void printOuter(){
        System.out.println("[Outer Class] Data: ");
    }

    //Local Inner Class
    public class Inner {

        private Integer innerData = 20;

        public void printInner(){
            System.out.println("[Inner Class Data]");
            System.out.println("outer_x = " + outer_x);
            System.out.println("outer_y = " + outer_y);
            System.out.println("outer_private = " + outer_private);
        }
    }

}
