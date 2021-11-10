package practice.lessons.generics;

import practice.lessons.staticlesson.StaticLesson;

import java.util.Scanner;

public class MainGenerics {

    public static void main(String[] args) {
        FirstGeneric<String> firstGeneric = new FirstGeneric<>("Kallol", 5);
        System.out.println(firstGeneric.getMyParam());

        FirstGeneric<Integer> integerFirstGeneric = new FirstGeneric<>(new Integer(10), 10);
        System.out.println(integerFirstGeneric.getMyParam());

        FirstGeneric<StaticLesson> staticLessonFirstGeneric = new FirstGeneric<>(new StaticLesson(10), 2);
        staticLessonFirstGeneric.getMyParam().print();


    }

}
