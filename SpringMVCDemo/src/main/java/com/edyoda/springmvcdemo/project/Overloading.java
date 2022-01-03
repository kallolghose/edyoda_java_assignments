package com.edyoda.springmvcdemo.project;

public class Overloading {

    /**
     * Returning sum of 2 numbers
     * @param a
     * @param b
     * @return
     */
    public int sum(int a, int b){
        return a + b;
    }

    public double sum(double a, double b){
        return a + b;
    }

    /**
     * Sum of three numbers
     * @param a
     * @param b
     * @param c
     * @return
     */
    public int sum(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        func1();
        func2();
    }

    public static void func1(){
        Overloading overloading = new Overloading();
        overloading.sum(10, 10);
    }

    public static void func2() {
        Overriding overriding = new Overriding("Kallol");
        overriding.displayMessage("asdas");
    }

}
