package revision.conditions;

public class PracticeIf {

    public void checkIfEvenOdd(int number){
        if(number % 2 == 0) {
            System.out.println(number + " is Even");
        }
        else {
            System.out.println(number + " is Odd");
        }
    }

    public void checkIfEvenOddSwitch(int number){
        int remainder = number % 2;
        switch (remainder){
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
        }
        System.out.println("After Switch");
    }

    public void switchDefault(int number){
        int remainder = number % 5; //remainder 1
        switch (remainder){
            case 0:
                System.out.println("Remainder is 0");
                break;
            case 1:
                System.out.println("Remainder is 1");
                break;
            default:
                System.out.println("Remainder is not 0 or 1");
                break;
        }
    }

}
