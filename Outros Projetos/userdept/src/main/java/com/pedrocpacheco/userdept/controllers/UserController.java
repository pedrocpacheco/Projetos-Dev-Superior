package com.pedrocpacheco.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedrocpacheco.userdept.entities.User;
import com.pedrocpacheco.userdept.repositories.UserRepository;

@RestController // -> Diz que a classe é um Controlador Rest, respondendo a requisições.
@RequestMapping(value = "/users") // -> Diz o caminho para chegar ao controlador
public class UserController {

    @Autowired // ! -> Mecanismo de injeção de dependencia, não precisa inicializar
    private UserRepository repository;
    
    // Criando Endpoints:
    
    @GetMapping
    public List<User> findAll(){
        List<User> users = repository.findAll();
        return users;
    }

}
