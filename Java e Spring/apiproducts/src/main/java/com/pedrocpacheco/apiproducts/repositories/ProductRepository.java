package com.pedrocpacheco.apiproducts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrocpacheco.apiproducts.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
