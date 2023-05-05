package com.pedrocpacheco.apiproducts.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_department")
public class Department {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Department(Long id, String name) {
        setId(id);
        setName(name);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        if(id < 0){
            throw new RuntimeException("ID Cannot be Null");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.equals(null))
            throw new RuntimeException("Name Cannot be Null");

        this.name = name;
    }
}
