package com.domain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.entity.Product;
import com.domain.repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductRepository productRepository;

	@GetMapping("/products")
	public List<Product> findAll() {
		List<Product> productsList = productRepository.findAll();
		return productsList;
	}

	@PostMapping("/products")
	public Product createProduct(@RequestBody Product product) {
		Product product2 = productRepository.save(product);
		return product2;

	}

	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable(value = "id") Long productId) {
		Product product = productRepository.findById(productId).get();
		return product;
	}

	@PutMapping("/products/{id}")
	public Product updateProduct(@PathVariable(value = "id") Long productId, @RequestBody Product product) {
		Product product1 = productRepository.findById(productId).get();
		product1.setDescription(product.getDescription());
		product1.setPrice(product.getPrice());
		product1.setProductName(product.getProductName());

		Product product2 = productRepository.save(product1);
		return product2;

	}

	@DeleteMapping("/products/{id}")
	public Boolean deleteProduct(@PathVariable(value = "id") Long productId) {
		productRepository.deleteById(productId);

		return true;
	}

}