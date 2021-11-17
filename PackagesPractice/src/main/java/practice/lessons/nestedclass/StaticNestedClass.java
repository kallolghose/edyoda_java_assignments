package practice.lessons.nestedclass;

public class StaticNestedClass {
    private static int data = 10;

    public static class InnerStaticClass {
        public void print(){
            System.out.println("Inner Static Class : " + data);
        }
    }
}
