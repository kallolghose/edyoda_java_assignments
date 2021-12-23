package com.edyoda;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestDB {

    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost:3306/edyoda_spring_mvc";
        String username = "kallol";
        String password = "password@123";
        try {
            Connection connection = DriverManager.getConnection(dbURL, username, password);
            System.out.println("Success !!");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
