package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import database.ConnectionFactory;

public class App2 {
	
	
	public static void main(String[] args) throws SQLException {
		
		PreparedStatement stmt;
		
		ConnectionFactory connFactory = new ConnectionFactory();
		Connection conn = connFactory.getConnection();
			
		/*PRODUTO*/
		stmt = conn.prepareStatement("INSERT INTO tb_product (name, price, image_uri, description) VALUES(?, ?, ?, ?)");
		
		stmt.setString(1, "Mais uma pizza");
		stmt.setDouble(2, 99.50);
		stmt.setString(3, "5.png");
		stmt.setString(4, "Mais uma pizza que vale muito a pena");
		
		stmt.execute();
		
		
		/*PEDIDO*/
		stmt = conn.prepareStatement("INSERT INTO tb_order(latitude, longitude, moment, status) VALUES(?, ?, ?, ?)");
		
		stmt.setDouble(1, -25.456241856018483);
		stmt.setDouble(2, -54.59183312108473);
		stmt.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
		stmt.setInt(4, 0);
		
		stmt.execute();
		
		stmt = conn.prepareStatement("SELECT * FROM tb_product");
		
		ResultSet result = stmt.executeQuery();
		
		while (result.next()) {
			System.out.println(result.getLong("id") + " : " + result.getString("name") + " : " + result.getDouble("price"));		
		}
		
		
		
		
	}

}
