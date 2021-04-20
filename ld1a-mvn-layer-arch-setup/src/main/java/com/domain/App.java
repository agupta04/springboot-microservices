package com.domain;

import com.domain.repository.ProductRepositoryImpl;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Traditional App without Spring Core...");
		ProductRepositoryImpl productRepositoryImpl = new ProductRepositoryImpl();
		System.out.println(productRepositoryImpl.findAll());
	}

}
