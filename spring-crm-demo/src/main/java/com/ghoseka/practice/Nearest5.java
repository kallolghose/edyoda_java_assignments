package com.ghoseka.practice;

import java.util.*;

public class Nearest5 {

    public static int findNearest5(int num){
        List<Integer> leftSidedNumbers = new ArrayList<>();
        List<Integer> rightSidedNumbers = new ArrayList<>();

        //Left sided numbers
        for(int i= num-1; i>=1; i--){
            if (isPrime(i))
                leftSidedNumbers.add(i);
            if (leftSidedNumbers.size() == 5)
                break;
        }

        //Right Sided numbers
        for (int i= num + 1; ;i++){
            if(isPrime(i))
                rightSidedNumbers.add(i);
            if (rightSidedNumbers.size() == 5)
                break;
        }


        return getMarkedNearest(num, leftSidedNumbers, rightSidedNumbers);
    }

    public static int getMarkedNearest(int n, List<Integer> leftSided, List<Integer> rightSided){
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> nearest = new ArrayList<>();
        int i=0, j=0;
        while (true){
            if(nearest.size() == 5)
                break;

            int leftDiff = 99999;
            if(i < leftSided.size())
                leftDiff = n - leftSided.get(i);

            int rightDiff = rightSided.get(j) - n;
            if(leftDiff < rightDiff){
                nearest.add(leftSided.get(i));
                i++;
            }
            else{
                nearest.add(rightSided.get(j));
                j++;
            }
        }

        Collections.sort(nearest);

        int diff = Math.abs(n - nearest.get(0));
        int num = nearest.get(0);
        for(int k=1; k<5; k++){
            int tmpDiff = Math.abs(n - nearest.get(k));
            if (tmpDiff > diff)
                num = nearest.get(k);
            if(tmpDiff == diff){
                if(num > nearest.get(k))
                    num = nearest.get(k);
            }
        }
        return num;
    }

    public static boolean isPrime(int num){
        if(num == 0 || num == 1)
            return false;
        if(num == 2 || num == 3)
            return true;
        int loop = (int) Math.sqrt(num);
        for (int i=2; i<=loop; i++){
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();
        System.out.println(findNearest5(number));

    }

}
