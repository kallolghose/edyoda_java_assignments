package com.edyoda.practice.loop;

import java.util.Scanner;

//4781 -> 1874 (integer)
public class NumberReverse {

    /*
    * 1. Divide
    * 2. Modulus (remainder)
    * Continuously until my num becomes 0
    * */
    public static int findReverse(int num){
        int rev = 0;
        while(num > 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
    }

    public static int findSumOfAllDigits(int num){
        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        return sum;
    }

    //Check if the given number is an Armstrong number
    //370 => 3^3 + 7^3 + 0^3
    //371 => 3^3 + 7^3 + 1^3
    //153 => 1^3 + 5^3 + 3+3
    public static boolean isArmstrongNumber(int num){
        int sum = 0;
        int temp = num;
        while(num > 0){
            int rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        if(temp == sum)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = scanner.nextInt();
        System.out.println("Reverse : " + findReverse(num));
        System.out.println("Sum of Digits : " + findSumOfAllDigits(num));
        System.out.println("Armstrong : " + isArmstrongNumber(num));
    }


}
