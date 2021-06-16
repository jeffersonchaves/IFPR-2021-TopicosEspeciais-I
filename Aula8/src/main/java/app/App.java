package app;

import java.sql.SQLException;
import java.util.List;

import models.Product;
import repositories.OrderRepository;
import repositories.ProductRepository;
import services.ProductService;

public class App {
	
	
	public static void main(String[] args) throws SQLException {
		
		OrderRepository repo = new OrderRepository();
		
		repo.findAll();
			
	}

}
