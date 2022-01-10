package com.ghoseka.practice.copy;


public class Main {

    public static void main(String[] args) {

        try{
            System.out.println("1");
            System.exit(1);
        }
        finally {
            System.out.println("3");
        }

    }
}
