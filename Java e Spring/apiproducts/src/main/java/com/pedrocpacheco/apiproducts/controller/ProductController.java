package com.pedrocpacheco.apiproducts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedrocpacheco.apiproducts.entities.Department;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
    
    @GetMapping
    public Department getDepartment(){
        var dep = new Department(10L, "Pedro");

        return dep;
    }

}
