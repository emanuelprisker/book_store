package com.onlinestore.kodigonlinestore;

import com.onlinestore.kodigonlinestore.ConnectionDB.ConnectionDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {
    public static void main(String[] args) {

        Connection conn = ConnectionDB.getConnection();

try{
    //crea objeto statement
    Statement myStatement = conn.createStatement();
    //Ejecutar query
    ResultSet rs = myStatement.executeQuery("SELECT * FROM CUSTOMER");
    // recorrer el result set
    while(rs.next()){
        //nombre de la columna
        System.out.println(rs.getString("id_customer")+" "+rs.getString("name")
        +" "+rs.getString("lastname")+" "+rs.getString("address")+" "+
                rs.getString("email")+ " "+rs.getString("telephone"));
    }
} catch (SQLException throwables) {
    throwables.printStackTrace();
}
    }
}
