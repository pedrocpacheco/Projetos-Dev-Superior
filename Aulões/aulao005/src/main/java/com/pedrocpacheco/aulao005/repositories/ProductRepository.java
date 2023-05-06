package com.pedrocpacheco.aulao005.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pedrocpacheco.aulao005.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
