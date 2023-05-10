package com.pedrocpacheco.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedrocpacheco.dslist.dto.GameListDTO;
import com.pedrocpacheco.dslist.entities.GameList;
import com.pedrocpacheco.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/list")
public class GameListController {
    
    @Autowired
    private GameListService service;

    @GetMapping
    public List<GameList> findAll(){
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public GameListDTO findById(@PathVariable Long id){
        return service.findById(id);
    }
    

}
