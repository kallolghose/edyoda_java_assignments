package com.edyoda.practice.serializable;

import java.io.*;

public class SerializableMain {

    public static void main(String[] args) throws Exception {

        //Student student = new Student("Kallol", "Ghose");
        ScienceStudent student = readData();
        System.out.println(String.format("Name : %s %s", student.getFirstName(), student.getLastName()));

//        ScienceStudent scienceStudent = new ScienceStudent("C", "D");
//        writeData(scienceStudent);


    }

    public static void writeData(ScienceStudent student) throws Exception {
        File file = new File("C:\\Users\\Hp\\OneDrive\\Teaching\\edYoda\\someFile\\object_science_2.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);

        objectOutputStream.close();
        fileOutputStream.close();
    }

    public static ScienceStudent readData() throws Exception {

        File file = new File("C:\\Users\\Hp\\OneDrive\\Teaching\\edYoda\\someFile\\object_science_2.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ScienceStudent student = (ScienceStudent) objectInputStream.readObject();

        objectInputStream.close();
        fileInputStream.close();

        return student;

    }
}
