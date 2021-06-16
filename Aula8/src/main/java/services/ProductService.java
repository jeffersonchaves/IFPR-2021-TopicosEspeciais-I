package services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import models.Product;
import repositories.ProductRepository;

public class ProductService {
	
	ProductRepository repository;
	
	public ProductService() {
		this.repository = new ProductRepository();
	}
	
	
	public List<Product> findAll() {
		//validacoes
		return repository.findAll();
	}	
	
	public Product instantiateProduct(ResultSet row) throws SQLException {
		
		Product product = new Product();
		
		product.setId(row.getLong("id"));
		product.setName(row.getString("name"));
		product.setPrice(row.getDouble("price"));
		product.setImageUri(row.getString("image_uri"));
		product.setDescription(row.getString("description"));
		
		return product;
		
	}

}
