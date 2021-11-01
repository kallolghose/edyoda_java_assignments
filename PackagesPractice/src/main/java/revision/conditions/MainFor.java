package revision.conditions;

import java.util.Scanner;

public class MainFor extends Object {

    public static void sumInput() {
        Object refForAnyObject;

        int arr[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter array values : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print("arr[" + i + "] : ");
            arr[i] = scanner.nextInt();
        }
        //practiceFor is an object of PracticeFor class
        PracticeFor practiceFor = new PracticeFor();
        //mainIf is an object of MainIf class
        MainIf mainIf = new MainIf();

        refForAnyObject = practiceFor;
        refForAnyObject = mainIf;

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
