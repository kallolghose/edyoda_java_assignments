package practice.lessons.staticlesson;

public class StaticMain {

    public static void main(String[] args) {
        //StaticLesson.decreaseStaticVarBy1();

        StaticLesson obj1 = new StaticLesson(10);
        obj1.increaseStaticVarBy1();
        obj1.print();
        obj1.increaseStaticVarBy1();
        obj1.increaseStaticVarBy1();

        System.out.println("=================");

        StaticLesson obj2 = new StaticLesson(100);
        obj2.print();

    }

}
