package practice.lessons.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsLearning {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = new ArrayList<>();
        listOfIntegers.add(10);
        listOfIntegers.add(10);
        listOfIntegers.add(20);
        System.out.println("Size : " + listOfIntegers.size());
        listOfIntegers.add(30);
        listOfIntegers.add(40);
        listOfIntegers.add(50);
        listOfIntegers.add(60);
        System.out.println("Size : " + listOfIntegers.size());

        //This is an old way to iterate
        System.out.println("Iteration");
        Iterator<Integer> integerIterator = listOfIntegers.iterator();
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
        System.out.println("Direct : " + listOfIntegers);

        //How we traverse it currently
        //For Each
        System.out.println("New Way");
        for(Integer data : listOfIntegers){
            System.out.println(data);
        }

        //Remove elements
        System.out.println("Remove 40");
        listOfIntegers.remove(3);
        System.out.println("Size : " + listOfIntegers.size());
        System.out.println("Direct : " + listOfIntegers);

        System.out.println("Does List contains 50 : " + listOfIntegers.contains(50));
        System.out.println("Does List contains 100 : " + listOfIntegers.contains(100));

    }

}
