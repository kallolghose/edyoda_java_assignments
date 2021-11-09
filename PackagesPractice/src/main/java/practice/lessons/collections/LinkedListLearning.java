package practice.lessons.collections;

import java.util.LinkedList;

public class LinkedListLearning {

    public static void main(String[] args) {

        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(new Integer(10)); //0
        integerLinkedList.add(new Integer(20)); //1
        integerLinkedList.add(30); //2

        System.out.println("Linked List : " + integerLinkedList);
        System.out.println("Size : " + integerLinkedList.size());
        integerLinkedList.remove(1);
        System.out.println("Linked List : " + integerLinkedList);
    }

}
