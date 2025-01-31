package com.carrental.db;
<<<<<<< HEAD
import java.sql.Connection;import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnection {    private static final String URL = "jdbc:postgresql://localhost:5432/CarRentalSystem";
    private static final String USER = "postgres";    private static final String PASSWORD = "191030";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);    }
}
=======

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "password";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
>>>>>>> 469bc3e25e7e525d7a1a46f4251c44de8b126e59
