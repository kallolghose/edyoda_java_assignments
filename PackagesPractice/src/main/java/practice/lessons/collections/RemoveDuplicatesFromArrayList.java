package practice.lessons.collections;

import java.util.*;

//Program to remove duplicates from Array List
public class RemoveDuplicatesFromArrayList {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(10);
        integerList.add(30);
        integerList.add(30);
        integerList.add(40);
        System.out.println("Array : " + integerList);
        //Remove the duplicates
        Set<Integer> integerSet = new TreeSet<>();
        integerSet.addAll(integerList);
        System.out.println("Without Duplicates : " + integerSet);
    }

}
