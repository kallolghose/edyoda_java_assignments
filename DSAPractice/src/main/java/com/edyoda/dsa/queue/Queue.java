package com.edyoda.dsa.queue;

import com.edyoda.dsa.singlell.Node;

public class Queue {

    private Node head;
    private Node tail;

    //O(1)
    //Create Queue
    public Queue() {
        head = null;
        tail = null;
    }

    //Time Complexity : O(1)
    //Space Complexity : O(1)
    public void enQueue(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            //There are no elements in the Queue
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    //TC : O(1)
    //SC : O(1)
    public boolean isEmpty() {
        return head == null;
    }

    public Node deQueue() {
        if (isEmpty())
            throw new RuntimeException("Queue Is Empty");
        Node tempNode = head;
        head = head.next;
        return tempNode;
    }

    public int peekQueue() {
        return head.data;
    }

    public void deleteQueue() {
        head = null;
        tail = null;
    }

    //TC : O(n)
    public void display() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(String.format("%d -> ", currentNode.data));
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);

        System.out.println("Traverse");
        queue.display();

        Node deQueued = queue.deQueue();
        System.out.println(String.format("\n\nDeQueued : %d ", deQueued.data));

        System.out.println("\nTraverse");
        queue.display();
    }

}
