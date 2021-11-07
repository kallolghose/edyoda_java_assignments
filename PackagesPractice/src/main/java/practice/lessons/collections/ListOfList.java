package practice.lessons.collections;

import java.util.ArrayList;

public class ListOfList {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(10);
        l2.add(40);

        arrayLists.add(l1);
        arrayLists.add(l2);

        System.out.println(arrayLists);

        for (ArrayList<Integer> list : arrayLists){
            System.out.println("========");
            for (Integer temp : list){
                System.out.println(temp);
            }
            System.out.println("========");
        }
    }
}
