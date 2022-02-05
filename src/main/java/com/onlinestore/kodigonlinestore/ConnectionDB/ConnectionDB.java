package com.onlinestore.kodigonlinestore.ConnectionDB;

import java.sql.*;


public class ConnectionDB {

    private static Connection connection;

    private ConnectionDB(){

    }

    public static Connection getConnection(){
        try {
            if (connection == null) {
               return connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
            } else {
                return connection;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }



}
