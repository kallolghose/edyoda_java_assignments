package practice.lessons.functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FirstProgram {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(10);
        listOfIntegers.add(20);
        listOfIntegers.add(30);
        listOfIntegers.add(40);
        //Lopping
        for(Integer item : listOfIntegers){
            System.out.println(item);
        }
        //Looping
        for(int i=0; i<listOfIntegers.size(); i++){
            System.out.println(listOfIntegers.get(i));
        }

        listOfIntegers.forEach(integer -> System.out.println(integer));

        Supplier<ArrayList<String>> arrayListSupplier = () -> new ArrayList<>();


    }

}
