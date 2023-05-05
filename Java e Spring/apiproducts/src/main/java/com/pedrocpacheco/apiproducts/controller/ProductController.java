package com.pedrocpacheco.apiproducts.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedrocpacheco.apiproducts.entities.Department;
import com.pedrocpacheco.apiproducts.entities.Product;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    
    @GetMapping
    public List<Product> getDepartment(){
        var depTech = new Department(1L, "Tech");
        var depPet = new Department(12L, "Pet");

        var p1 = new Product(1L, "Macbook Pro", 4000.0, depTech);
        var p2 = new Product(2L, "Gamer Computer", 7000.0, depTech);
        var p3 = new Product(3L, "Lully's Tiara", 40.0, depPet);

        var productList = Arrays.asList(p1, p2, p3);

        return productList;
    }

}
