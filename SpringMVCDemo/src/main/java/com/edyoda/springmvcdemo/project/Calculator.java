package com.edyoda.springmvcdemo.project;

import java.util.Scanner;

/**
 * Create a calculator program whereby the user will be given a list of options to choose from. You need to perform the corresponding operation
 * And take the input continuously  from the user until he/she exits the same.
 * While dividing if the divisor is 0 then raise CannotDivideException (Custom Exception)
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b = 0;
        while (true){ //Infinite loop
            displayOptions();
            String choice = scanner.next();
            switch (choice){
                case "a":
                case "A":
                    System.out.print("Input Number 1 : ");
                    a = scanner.nextInt();
                    System.out.print("Input Number 2 : ");
                    b = scanner.nextInt();
                    System.out.println("Add : " + (a+b));
                    break;
                case "s":
                case "S":
                    System.out.print("Input Number 1 : ");
                    a = scanner.nextInt();
                    System.out.print("Input Number 2 : ");
                    b = scanner.nextInt();
                    System.out.println("Substract : " + (a-b));
                    break;
                case "d":
                case "D":
                    System.out.print("Input Number 1 : ");
                    a = scanner.nextInt();
                    System.out.print("Input Number 2 : ");
                    b = scanner.nextInt();
                    if(b == 0)
                        throw new CannotDivideException("Cannot Divide by 0");
                    System.out.println("Divide : " + (a/b));
                    break;
                case "e":
                case "E":
                    System.out.println("Exiting...");
                    System.exit(1);
                default:
                    System.out.println("Please enter a valid option");

            }
        }

    }

    public static void displayOptions(){
        System.out.println("::::::: Options for Calculator :::::::::");
        System.out.println("[A]dd");
        System.out.println("[S]ubstract");
        System.out.println("[M]ultiply");
        System.out.println("[D]ivide");
        System.out.println("[E]xit");
        System.out.print("Please enter you choice : ");
    }

}
