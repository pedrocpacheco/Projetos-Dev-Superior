package com.pedrocpacheco.aulao005.resources;
// É no Resources, onde faremos a navegação da pagina.

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedrocpacheco.aulao005.entities.Category;

@RestController // -> Faz o Spring entender como Recurso
@RequestMapping(value = "/categories") // -> Passa o caminho para chegar
public class CategoryResources {
    
    @GetMapping // -> Diz que estamos usando uma requisição GET
    public ResponseEntity<List<Category>> findAll(){
           // A resposta vai ser uma List de Category
        List<Category> listCategories = new ArrayList<>();
        listCategories.add(new Category(1L, "Pedro"));
        listCategories.add(new Category(2L, "Luane"));

        return ResponseEntity.ok().body(listCategories);
    }

    @GetMapping(value = "/{id}") //-> Adicionando valores extras na url
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category cat = new Category(id, "Pedro");
        return ResponseEntity.ok().body(cat);
    }

}
