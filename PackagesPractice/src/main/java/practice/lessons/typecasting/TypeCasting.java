package practice.lessons.typecasting;

public class TypeCasting {

    public static void main(String[] args) {
        int intData = 10;
        double doubleData = intData; //Widening

        double someData = 10.0001;
        int someDateInt = (int) someData; //Narrowing

        System.out.println(intData + "  " + doubleData);
        System.out.println(someData + "  " + someDateInt);
    }

}
