package practice.lessons.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSets {

    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        System.out.println("Is Empty : " + integerSet.isEmpty());
        integerSet.add(10);
        System.out.println("Is Empty : " + integerSet.isEmpty());
        integerSet.add(10);
        integerSet.add(20);
        integerSet.add(30);
        System.out.println("Direct : " + integerSet);
        System.out.println("Size : " + integerSet.size());
        integerSet.add(100);
        integerSet.add(200);
        System.out.println("Size : " + integerSet.size());

        System.out.println("Iteration");
        Iterator<Integer> integerIterator = integerSet.iterator();
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
    }
}
