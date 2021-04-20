package com.domain.repository;

import java.util.ArrayList;
import java.util.List;

import com.domain.model.Product;

public class ProductRepositoryImpl implements ProductRepository {

	public List<Product> findAll() {
		List<Product> productsList = new ArrayList<Product>();
		productsList.add(new Product("P01", "Man`s Search for Meaning", 300));
		productsList.add(new Product("P02", "Awaken the Giant Within", 500));

		return productsList;
	}
}
