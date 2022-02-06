package com.onlinestore.kodigonlinestore;

import com.onlinestore.kodigonlinestore.ConnectionDB.ConnectionDB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootApplication
@RestController
public class KodigonlinestoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(KodigonlinestoreApplication.class, args);
	}
	@GetMapping

	public static String test() {
		Connection conn = ConnectionDB.getConnection();

		try{
			//crea objeto statement
			Statement myStatement = conn.createStatement();
			//Ejecutar query
			ResultSet rs = myStatement.executeQuery("SELECT * FROM CUSTOMER");
			String str;
			// recorrer el result set
			while(rs.next()){
				//nombre de la columna
				str = (rs.getString("id_customer")+" "+rs.getString("name")
						+" "+rs.getString("lastname")+" "+rs.getString("address")+" "+
						rs.getString("email")+ " "+rs.getString("telephone"));
				return str;
			}
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		return null;
	}

}
