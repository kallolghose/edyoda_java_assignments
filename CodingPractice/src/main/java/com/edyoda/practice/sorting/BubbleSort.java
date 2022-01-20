package com.edyoda.practice.sorting;

import java.util.Scanner;

public class BubbleSort {

    public int [] performSort(int [] intArr){
        int n = intArr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(intArr[j] > intArr[j + 1]){
                    int temp = intArr[j];
                    intArr[j] = intArr[j+1];
                    intArr[j+1] = temp;
                }
            }
        }
        return intArr;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.println("Enter Array : ");
        for (int i=0; i<arr.length; i++){
            System.out.print(String.format("Arr[%d] : ", i));
            arr[i] = scanner.nextInt();
        }

        BubbleSort bubbleSort = new BubbleSort();
        arr = bubbleSort.performSort(arr);
        System.out.println("Memory Address : " + arr);
        System.out.println("Sorted Array : ");
        for (int i=0; i<arr.length; i++){
            System.out.println(String.format("%d", arr[i]));
        }

    }

}
