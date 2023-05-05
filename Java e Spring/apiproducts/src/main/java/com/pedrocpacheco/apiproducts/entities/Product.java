package com.pedrocpacheco.apiproducts.entities;

public class Product {
    
    private Long id;
    private String name;
    private Double price;

    private Department department;

    public Product(Long id, String name, Double price, Department department) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Department getDepartment() {
        return department;
    }


}
