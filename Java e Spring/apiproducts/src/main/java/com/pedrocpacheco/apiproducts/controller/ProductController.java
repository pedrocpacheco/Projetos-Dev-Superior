package com.pedrocpacheco.apiproducts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedrocpacheco.apiproducts.entities.Product;
import com.pedrocpacheco.apiproducts.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    
    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> getDepartment(){
     
        List<Product> productList = this.productRepository.findAll();

        return productList;
    }

}
