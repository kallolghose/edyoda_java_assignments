package revision.conditions;

import java.util.Scanner;

public class MainIf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = scanner.nextInt();
        PracticeIf practiceIf = new PracticeIf();
        practiceIf.switchDefault(number);
    }

}
