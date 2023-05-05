package com.pedrocpacheco.apiproducts.entities;

public class Department {
    
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
