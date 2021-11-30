package com.edyoda.dsa.array;

public class ArrayDS {

    //Array of 10 elements
    private int [] number = new int[10]; //Declare and Instantiating Array

    public ArrayDS() {
        number[0] = 0;
        number[1] = 0;
        number[2] = 0;
        number[3] = 0;
        number[4] = 0;
        number[5] = 0;
        number[6] = 0;
        number[7] = 0;
        number[8] = 0;
        number[9] = 0;
    }

    //O(1)
    public void insert(int index, int num){
        if(index >= number.length)
            throw new RuntimeException("Index not Found");
        number[index] = num;
    }

    //O(n)
    public void traverse(){
        for(int i=0;i<number.length;i++){
            System.out.println("number [" + i + "] = " + number[i]);
        }
    }

    //O(1)
    public int access(int index){
        if(index >= number.length)
            throw new RuntimeException("Index not Found");
        return number[index];
    }

    //O(n)
    public void search(int num){
        for(int i=0;i<number.length;i++){
            if(number[i] == num){
                System.out.println("Number found");
                return;
            }
        }
        System.out.println("Number NOT Found");
    }

    public static void main(String[] args) {
        ArrayDS arrayDS = new ArrayDS();
        arrayDS.insert(4, 100);
        arrayDS.traverse();
    }

}
