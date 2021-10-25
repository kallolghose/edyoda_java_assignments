package edyoda.javaclasses;

public class MainCalculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("1 + 2 = " + calculator.add(1, 2));
        System.out.println("1 + 2 + 3 = " + calculator.add(1, 2, 3));
    }

}
