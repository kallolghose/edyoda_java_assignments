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
    //Time Complexity -> O(n)
    //Space Complexity -> O(1)
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
            //Insertion at a given location
            Node temp = head;
            for(int i=1; i < location - 1; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size = size + 1;
        }
    }

    //Time Complexity -> O(n)
    //Space Complexity -> O(1)
    public void traversal(){
        Node temp = head;
        while(temp != null){
            System.out.print(String.format("%d -> ", temp.data));
            temp = temp.next;
        }
    }

    public void search(int search){
        Node temp = head;
        while (temp != null){
            if(search == temp.data){
                System.out.println(String.format("%d Found", search));
                return;
            }
            temp = temp.next;
        }
        System.out.println(String.format("%d NOT Found", search));
    }

    //Time Complexity -> O(n)
    //Space Complexity -> O(1)
    public void deleteNode(int location){
        if(head == null)
            throw new RuntimeException("Nothing to delete");

        if(location == 0){
            //1. When there are more than one node
            head = head.next;
            //2. When there is only 1 node
            if(head == null)
                tail = null;
            size = size - 1;
        }
        else if(location >= size){
            //When there is only one node
            if(head == tail){
                head = null;
                tail = null;
                size = size - 1;
                return;
            }
            //When there are more than 1 node
            Node temp = head;
            for(int i = 1; i < size - 1; i++){
                temp = temp.next;
            }
            tail = temp;
            temp.next = null;
            size = size - 1;
        }
        else {
            Node temp = head;
            for(int i=1; i<location - 1; i++){
                temp = temp.next;
            }
            temp.next = (temp.next).next;
            size = size - 1;
        }
    }

    public void deleteLL(){
        head = tail = null;
        size = 0;
    }

    public void reverse(){
        Node tempHead = head;
        Node prev = null;
        Node temp = head;

        while (temp != null){
            Node next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        head = prev;
        tail = tempHead;
    }

    public void reverseK(int k){
        Node currentNode = head;
        Node prevNode = null;
        while (currentNode != null){
            Node nextNode = reverseKNode(prevNode, currentNode, k);
            prevNode = currentNode;
            currentNode = nextNode;
        }
        prevNode.next = null;
    }

    private Node reverseKNode(Node prevNode, Node currentNode, int k){
        Node prev = prevNode;
        Node temp = currentNode;
        while(temp !=null && k > 0){
            Node next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
            k = k - 1;
        }
        if(prevNode == null)
            head = prev;
        else
            prevNode.next = prev;
        return temp;
    }




    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        System.out.println("Creating LL with value 10");
        singleLinkedList.create(10);

        System.out.println("Inserting to LL 20, 30 at the end");
        singleLinkedList.insert(20, 100);
        singleLinkedList.insert(30, 100);
        singleLinkedList.insert(40, 100);
        singleLinkedList.insert(50, 100);
        singleLinkedList.insert(60, 100);
        singleLinkedList.insert(70, 100);
        singleLinkedList.insert(80, 100);

        System.out.println("Traversal");
        singleLinkedList.traversal();

        System.out.println("\n");

        singleLinkedList.search(20);
        singleLinkedList.search(100);

        singleLinkedList.reverseK(3);
        singleLinkedList.traversal();
    }

}
