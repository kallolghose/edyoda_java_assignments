package practice.lessons.generics;

import practice.lessons.staticlesson.StaticLesson;

import java.util.ArrayList;

public class GenericsLesson {

    public static void main(String[] args) {
        //Before java v1.5
        ArrayList arrayListOfString = new ArrayList();
        arrayListOfString.add("Kallol");
        arrayListOfString.add("Amit");
        arrayListOfString.add(new Integer(10));
        arrayListOfString.add(new StaticLesson(10));

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Kallol");
        arrayList.add("Amit");

        String val1 = (String) arrayListOfString.get(0);
        String val3 = (String) arrayListOfString.get(2);
        System.out.println("Val 1 : " + val1 + ", Val3 : " + val3);
    }

}
