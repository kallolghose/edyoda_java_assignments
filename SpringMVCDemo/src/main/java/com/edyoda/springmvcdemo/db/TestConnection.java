package com.edyoda.springmvcdemo.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {
    public static void main(String[] args) throws Exception {
        String jdbcUrl = "jdbc:mysql://localhost:3306/edyoda_spring_mvc";
        String username = "kallol";
        String password = "password@123";
        Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
    }
}
