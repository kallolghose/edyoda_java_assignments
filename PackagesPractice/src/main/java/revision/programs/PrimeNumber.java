package revision.programs;

import java.util.Scanner;

public class PrimeNumber {

    //7 (2,3,4,5,6) => will my remainder be zero (NO) -> Prime Number
    //8 (2) -> will me remainder be zero (Yes) -> NOT a prime number
    public boolean isPrime(int number){
        if(number == 1 || number == 2)
            return true; //It is a prime number
        for(int i = 2; i < number; i++){
            if(number % i == 0)
                return false; //It is not a PRIME NUMBER
        }
        return true; //IT IS A PRIME NUMBER as the IF CONDITION in FOR LOOP was not satisfied
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = scanner.nextInt();

        PrimeNumber primeNumber = new PrimeNumber();
        System.out.println("Is Prime : " + primeNumber.isPrime(number));
    }

}
