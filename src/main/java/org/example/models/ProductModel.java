package org.example.models;

import org.example.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductModel {
	
	public Product find() {
		return new Product("p01", "name1", 5.8, 2, true);
	}
	
	public List<Product> findAll(){
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("p01", "name1", 5.8, 2, true));
		products.add(new Product("p02", "name2", 5.5, 1, true));
		products.add(new Product("p03", "name3", 5.0, 3, false));
		return products;
	}
}
