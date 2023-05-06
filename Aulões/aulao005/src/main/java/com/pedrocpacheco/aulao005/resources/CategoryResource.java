package com.pedrocpacheco.aulao005.resources;
// É no Resources, onde faremos a navegação da pagina.

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedrocpacheco.aulao005.entities.Category;
import com.pedrocpacheco.aulao005.repositories.CategoryRepository;

@RestController // -> Faz o Spring entender como Recurso
@RequestMapping(value = "/categories") // -> Passa o caminho para chegar
public class CategoryResource {
    
    @Autowired // !!! -> faz a criação de instancia sozinho
    private CategoryRepository categoryRepository;

    @GetMapping // -> Diz que estamos usando uma requisição GET
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = categoryRepository.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category cat = categoryRepository.findById(id);
        return ResponseEntity.ok().body(cat);
    }

}
