package practice.lessons.functionalprogramming;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(10);
        listOfIntegers.add(20);
        listOfIntegers.add(30);
        listOfIntegers.add(40);

//        for(int i=0; i<listOfIntegers.size(); i++){
//            int temp = listOfIntegers.get(i);
//            listOfIntegers.set(i, temp + 5);
//        }
//
//        System.out.println(listOfIntegers);

        listOfIntegers.stream()
                .map(item -> item + 5)
                .forEach(item -> System.out.println(item));

    }
}
