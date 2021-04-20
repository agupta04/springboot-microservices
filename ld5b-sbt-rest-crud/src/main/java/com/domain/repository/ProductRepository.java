package com.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.domain.entity.Product;

// annotation based configuration
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}