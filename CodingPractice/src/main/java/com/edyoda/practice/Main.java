package com.edyoda.practice;

import com.edyoda.practice.serializable.Student;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        String a = "Kallol";
        String b = "Kallol";
        String c = new String("Kallol");

        //What all variable have the same memory address ?
        //Comparable and Comparator
        //Runtime Polymorphism



        //Student student = new Student("Kallol", "Ghose");
        Student student = readData();
        System.out.println(String.format("Name : %s %s", student.getFirstName(), student.getLastName()));

    }

    public static void writeData(Student student) throws Exception {
        File file = new File("C:\\Users\\Hp\\OneDrive\\Teaching\\edYoda\\someFile\\object.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);

        objectOutputStream.close();
        fileOutputStream.close();
    }

    public static Student readData() throws Exception {

        File file = new File("C:\\Users\\Hp\\OneDrive\\Teaching\\edYoda\\someFile\\object.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student student = (Student) objectInputStream.readObject();

        objectInputStream.close();
        fileInputStream.close();

        return student;

    }

}
