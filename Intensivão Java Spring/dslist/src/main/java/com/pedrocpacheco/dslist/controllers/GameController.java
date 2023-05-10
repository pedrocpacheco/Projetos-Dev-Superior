package com.pedrocpacheco.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedrocpacheco.dslist.dto.GameDTO;
import com.pedrocpacheco.dslist.dto.GameMinDto;
import com.pedrocpacheco.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    
    @Autowired
    private GameService service;

    @GetMapping
    public List<GameMinDto> findAll(){
        List<GameMinDto> result = service.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){ // -> @PathVariable diz que aquele  parametro é entregue pela URL
        GameDTO result = service.findById(id);
        return result;
    }

}
