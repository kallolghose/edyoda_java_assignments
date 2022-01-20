package com.edyoda.practice.recursion;

public class Recursive {

    public int factorial(int n){
        if(n == 0 || n == 1)
            return 1;
        return n * factorial(n-1);
    }

}
