package com.pedrocpacheco.aulao005.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.pedrocpacheco.aulao005.entities.Category;

@Component // 0- Necessario para usar o Autowired no CategoryResources 
public class CategoryRepository {
    
    // 1- Criando Map com relação ID -> Categoria
    private Map<Long, Category> map = new HashMap<>();

    // 2- Salvando em um Map a categoria referente ao seu ID
    public void save(Category objCategory){
        map.put(objCategory.getId(), objCategory); 
    }

    // 3- Retornando uma Categoria com o ID informado
    public Category findById(Long id){
        Category categoryFound = map.get(id);
        return categoryFound;
    }

    // 4- Salvando os valores do Map em uma lista, e então retornando a lista.
    public List<Category> findAll(){
        return new ArrayList<Category>(map.values());
    }

}
