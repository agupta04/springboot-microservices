package com.domain.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.model.Product;

//annotations provide metadata
@RestController
@RequestMapping("/rest")
public class ProductController {

	@GetMapping("/products")
	public List<Product> getAllProducts() {
		List<Product> productsList = new ArrayList<Product>();
		productsList.add(new Product("P01", "Power of Now"));
		productsList.add(new Product("P02", "Start with Why"));
		System.out.println("Products : " + productsList);
		return productsList;
	}

}