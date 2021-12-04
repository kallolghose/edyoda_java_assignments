package com.edyoda.dsa.recursion;

public class Recursive {

    public int findFactorialIterative(int number){
        if(number == 0)
            return 1;
        int fact = 1;
        for(int i=1; i<=number; i++){
            fact = fact * i;
        }
        return fact;
    }

    public void someEx(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("askdhkasjd");
            }
        }
    }

    public int findFactorial(int number){
        if(number == 0)
            return 1;
        return number * findFactorial(number-1);
    }

    public static void main(String[] args) {
        Recursive recursive = new Recursive();
        int fact = recursive.findFactorial(5);
        System.out.println("Fact : " + fact);
    }

}

