package com.edyoda.dsa.singlell;

public class SingleLinkedList {

    private Node head;
    private Node tail;
    private int size;

    //Creating of Link List
    //Time Complexity O(1)
    //Space Complexity O(1) -> New Space being created or Used
    public void create(int data){
        Node node = new Node(data);
        head = node;
        tail = node;
        size = 1;
    }

    //Insertion
    //location == 0 -> It means insert at start of the link list
    public void insert(int data, int location){
        if(head == null)
            throw new RuntimeException("No Linked List");

        Node newNode = new Node(data);

        if (location == 0){
            //Insert at the head of the link list
            newNode.next = head;
            head = newNode;
            size = size + 1;
        }
        else if(location >= size){
            //Insert at the end of the link list
            tail.next = newNode;
            tail = newNode;
            size = size + 1;
        }
        else{
            Node temp = head;
            for(int i=1; i < location - 1; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size = size + 1;
        }

    }


}
