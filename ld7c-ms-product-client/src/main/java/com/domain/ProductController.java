package com.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//annotations provide metadata
@RestController
@RequestMapping("/rest")
public class ProductController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/products")
	public Product[] getAllProducts() {
		// Fetch data from the RESTful service
		String url = "http://localhost:8071/rest/products";
		ResponseEntity<Product[]> responseEntity = restTemplate.getForEntity(url, Product[].class);
		Product[] products = responseEntity.getBody();
		return products;
	}

}