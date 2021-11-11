package practice.lessons.generics;

import java.util.ArrayList;
import java.util.List;

public class WildcardLesson {

    //Use this function to add all the elements of a list
    //List should be List of Integers, List of Longs, List of Double, List of Float
    //Whatever list one is sending that should be a subclass of Number
    public static double addAllElements(List<? extends Number> list){
        double sum = 0.0D;
        for(int i=0; i<list.size(); i++){
            sum = sum + ((Number) list.get(i)).doubleValue();
        }
        return sum;
    }


    //I only want either Integer or the Super Class of Integer (Number)
    public static int addOnlyIntegerOrNumberWalaList(List<? super Integer> list){
        int sum = 0;
        for(int i=0; i<list.size(); i++){
            sum = sum + ((Number) list.get(i)).intValue();
        }
        return sum;
    }


    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);

        List<Double> doubles = new ArrayList<>();
        doubles.add(20.0);
        doubles.add(30.10);

        List<Number> numbers = new ArrayList<>();
        doubles.add(20.0);
        doubles.add(300.0);


        System.out.println(addAllElements(integers));
        System.out.println(addAllElements(doubles));
        System.out.println(addOnlyIntegerOrNumberWalaList(integers));
        System.out.println(addOnlyIntegerOrNumberWalaList(numbers));
        //System.out.println(addAllElements(strings)); //WRONG FOR ME

    }

}
