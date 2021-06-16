package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.ConnectionFactory;
import enums.OrderStatus;
import models.Order;

public class OrderRepository {
	
	private Connection connection = ConnectionFactory.getConnection();
	
	
	public void findAll(){
		
		
		try {
			
			String sql = "SELECT * FROM tb_order "
				+ "INNER JOIN tb_order_product ON tb_order.id = tb_order_product.order_id "
				+ "INNER JOIN tb_product ON tb_product.id = tb_order_product.product_id";
		
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			ResultSet result = stmt.executeQuery();
			
			
			while (result.next()) {
				Order order = new Order();
				order.setId(result.getLong("order_id"));
				order.setLatitude(result.getDouble("latitude"));
				order.setLongitude(result.getDouble("longitude"));
				order.setMoment(result.getTimestamp("moment"));
				order.setStatus(OrderStatus.values()[result.getInt("status")]);
				
				System.out.println(order);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}
