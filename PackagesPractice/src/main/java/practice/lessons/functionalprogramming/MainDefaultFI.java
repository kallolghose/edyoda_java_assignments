package practice.lessons.functionalprogramming;

import practice.lessons.markers.Address;
import practice.lessons.markers.Person;

import java.util.function.*;

public class MainDefaultFI {

    public static void main(String[] args) {
        //Supplier
        Supplier<Address> addressSupplier = () -> new Address("l1", "l2", "India", 793006);
        Address address = addressSupplier.get();

        //Consumer
        Consumer<Person> personConsumer = (p1) -> {
            p1.setFullName("Kallol Ghose");
            p1.print();
        };

        Person person = new Person("KG", 29);

        //BiConsumer
        BiConsumer<Person, Address> consumerWhichPrintNameAndAddress = (p1, add1) -> {
         p1.print();
         add1.print();
        };
        consumerWhichPrintNameAndAddress.accept(person, address);

        //Predicate
        Predicate<Person> isAgeGreaterThan30 = p1 -> p1.getAge() > 30;
        System.out.println("Predicate : " + isAgeGreaterThan30.test(person));

        //Function
        Function<String, Long> stringLongFunction = str -> Long.valueOf(str);
        Long l = stringLongFunction.apply("10000");
        System.out.println(l);

        BiFunction<String, Integer, Long> stringIntegerLongFunction = (str, int1) -> {
          Long l1 = Long.valueOf(str) + Long.valueOf(int1);
          return l1;
        };
        System.out.println(stringIntegerLongFunction.apply("10", 100));

        //Unary
        //Function<String, String> helloFunc = name -> String.format("Hello %s", name);
        UnaryOperator<String> helloFunc = name -> String.format("Hello %s", name);
        System.out.println(helloFunc.apply("Kallol"));

//        BiFunction<String, String, String> helloFullName = (fName, lName) ->
//                String.format("Full Name : %s %s", fName, lName);

        BinaryOperator<String> helloFullName = (fName, lName) ->
                String.format("Full Name : %s %s", fName, lName);
        System.out.println(helloFullName.apply("Kallol", "Ghose"));

    }

}
