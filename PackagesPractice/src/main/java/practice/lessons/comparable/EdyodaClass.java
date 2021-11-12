package practice.lessons.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EdyodaClass {

    public static void main(String[] args) {

//        Student amit = new Student("Amit", 22, 90.0);
//        Student sai = new Student("Sai", 23, 95.0);
//
//        System.out.println(amit.compareTo(sai));
//        System.out.println(sai.compareTo(amit));


        List<Student> students = new ArrayList<>();
        students.add(new Student("Amit", 22, 90.0));
        students.add(new Student("Sai", 23, 95.0));
        students.add(new Student("Lavanya", 21, 85.77));
        students.add(new Student("Aditya", 21, 82.07));
        students.add(new Student("Srilekha", 24, 99.99));

        System.out.println("::::::::::: Unsorted ::::::::::::::");
        for (Student student : students){
            student.print();
        }

        System.out.println("\n\n::::::::::::: Sort By Age ::::::::::::::");
        Collections.sort(students);
        for (Student student : students){
            student.print();
        }

        //Sort it by percentage or name
        System.out.println("\n\n ::::::::::::: Sort by Name ::::::::::::::: ");
        Collections.sort(students, new NameComparator());
        for (Student student : students){
            student.print();
        }

    }

}
