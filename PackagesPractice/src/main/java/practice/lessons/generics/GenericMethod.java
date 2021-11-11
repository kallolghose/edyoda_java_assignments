package practice.lessons.generics;

import practice.lessons.staticlesson.StaticLesson;

public class GenericMethod {

    //Generic Method
    public static <T, V> void print(T param, V param2){
        System.out.println("Print : " + param.toString());
    }

    public static void main(String[] args) {
        GenericMethod.print("Kallol", 10); //String
        GenericMethod.print(10, new StaticLesson(10));
        GenericMethod.print("String", "Strng");
    }

}
