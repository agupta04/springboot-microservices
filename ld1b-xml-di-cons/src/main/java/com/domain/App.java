package com.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.domain.service.ProductService;

public class App {
	public static void main(String[] args) {
		System.out.println("App with Spring and IOC....");
		useClassPath();
//		useFileSystem();
	}

	private static void useClassPath() {
		// ProductRepositoryImpl productRepositoryImpl = new ProductRepositoryImpl();
		// IOC & DI
		// Expecting the Spring Framework to inject the dependency.
		ProductService productService = null;
		// ClassPathXmlApplicationContext classPathXmlApplicationContext = new
		// ClassPathXmlApplicationContext(
		// "applicationContext.xml");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		productService = applicationContext.getBean("productService", ProductService.class);
		System.out.println(productService.findAll());
		((ClassPathXmlApplicationContext) applicationContext).close();
	}

}
