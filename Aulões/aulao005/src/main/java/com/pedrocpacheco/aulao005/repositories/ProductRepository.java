package com.pedrocpacheco.aulao005.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.pedrocpacheco.aulao005.entities.Product;

@Component
public class ProductRepository {
    
    private Map<Long, Product> map = new HashMap<>();

    public void save(Product product){
        map.put(product.getId(), product);
    }

    public List<Product> findAll(){
        return new ArrayList<Product>(map.values());
    }

    public Product findById(Long id){
        Product productFound = map.get(id);
        return productFound;
    }

}
