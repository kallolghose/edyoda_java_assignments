package revision.conditions;

import java.util.Scanner;

public class MainFor {

    public static void sumInput() {
        int arr[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array values : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print("arr[" + i + "] : ");
            arr[i] = scanner.nextInt();
        }
        PracticeFor practiceFor = new PracticeFor();
        int sum = practiceFor.findSumOfArray(arr);
        System.out.println("SUM : " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input n : ");
        int n = scanner.nextInt();
        PracticeFor practiceFor = new PracticeFor();
        practiceFor.printRightTrianglePattern(n);
    }
}
