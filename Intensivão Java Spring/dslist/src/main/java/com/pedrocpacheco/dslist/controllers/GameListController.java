package com.pedrocpacheco.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedrocpacheco.dslist.dto.GameListDTO;
import com.pedrocpacheco.dslist.dto.GameMinDTO;
import com.pedrocpacheco.dslist.dto.ReplacementDTO;
import com.pedrocpacheco.dslist.entities.GameList;
import com.pedrocpacheco.dslist.services.GameListService;
import com.pedrocpacheco.dslist.services.GameService;

@RestController
@RequestMapping(value = "/list")
public class GameListController {
    
    @Autowired
    private GameListService service;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameList> findAll(){
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public GameListDTO findById(@PathVariable Long id){
        return service.findById(id);
    }
    
    @GetMapping(value ="/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        List<GameMinDTO> result = gameService.finByList(listId);
        return result;
    }

    @PostMapping(value ="/{listId}/replacement")
    public void movie(@PathVariable Long listId, @RequestBody ReplacementDTO body){
        service.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }

    

}
