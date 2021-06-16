package models;

import lombok.Data;

@Data
public class Product {
	
	private Long id;
	private String name;
	private Double price;
	private String imageUri;
	private String description;

}
