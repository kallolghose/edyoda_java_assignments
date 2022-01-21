package com.edyoda.practice.serializable;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ScienceStudent extends Student {

    public ScienceStudent(String firstName, String lastName) {
        super(firstName, lastName);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws Exception {
        throw new NotSerializableException();
    }

    private Object readObject(ObjectInputStream objectInputStream) throws Exception {
        throw new NotSerializableException();
    }

    @Override
    public void displayName(){
        System.out.println(String.format("ScienceStudent Class Name : %s %s", getFirstName(), getLastName()));
    }
}
