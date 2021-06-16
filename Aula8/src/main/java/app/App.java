package app;

import java.sql.SQLException;
import java.util.List;

import models.Product;
import repositories.ProductRepository;
import services.ProductService;

public class App {
	
	
	public static void main(String[] args) throws SQLException {
		
		ProductService service = new ProductService();
		
		List<Product> products = service.findAll();
		
		for (Product product : products) {
			System.out.println(product);
		}
			
	}

}
