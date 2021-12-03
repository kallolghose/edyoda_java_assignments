package com.edyoda.dsa.stacks;

import com.edyoda.dsa.singlell.Node;

public class Stacks {

    private Node top;

    public Stacks(){
        top = null;
    }

    //Time Complexity -> O(1)
    //Space Complexity -> O(1)
    public void push(int data){
        Node newNode = new Node(data);
        if(top == null)
            top = newNode;
        else {
            newNode.next = top;
            top = newNode;
        }
    }

    //Time Complexity -> O(1)
    //Space Complexity -> O(1)
    public boolean isStackEmpty(){
        return top == null;
    }

    //Time Complexity -> O(1)
    //Space Complexity -> O(1)
    public Node pop(){
        if(isStackEmpty())
            throw new RuntimeException("Nothing to delete");
        Node tempNode = top;
        top = top.next;
        return tempNode; //I want to say what node was deleted
    }

    //What is the value of the top most element
    //Time Complexity -> O(1)
    //Space Complexity -> O(1)
    public int peek(){
        if(isStackEmpty())
            throw new RuntimeException("Nothing to peek");
        return top.data;
    }

    //Time Complexity -> O(1)
    //Space Complexity -> O(1)
    //Deleting the whole stack
    public void delete(){
        top = null;
    }

    public int evaluatePostfix(String expr){
        String contents [] = expr.split(" ");
        for(String ch : contents){
            if(isOperator(ch)){
                //POP 2 elements
            }
            else{
                //PUSH
            }
        }
    }

    public boolean isOperator(String str){
        switch (str){
            case "+":
            case "-":
            case "/":
            case "%":
                return true;
            default:
                return false;
        }
    }

}
