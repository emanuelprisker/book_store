package com.onlinestore.kodigonlinestore.ConnectionDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {
    public static void main(String[] args) {

        Connection conn = ConnectionDB.getConnection();

try{
    //crea objeto statement
    Statement miStatement = conn.createStatement();
    //Ejecutar query
    ResultSet rs = miStatement.executeQuery("SELECT * FROM CLIENT");
    // recorrer el result set
    while(rs.next()){
        //nombre de la columna
        System.out.println(rs.getString("id_client")+" "+rs.getString("client_name")
        +" "+rs.getString("lastname")+" "+rs.getString("adress")+" "+
                rs.getString("email")+ " "+rs.getString("telephone"));
    }
} catch (SQLException throwables) {
    throwables.printStackTrace();
}
    }
}
