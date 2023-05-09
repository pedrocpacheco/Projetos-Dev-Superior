package com.pedrocpacheco.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedrocpacheco.dslist.dto.GameMinDto;
import com.pedrocpacheco.dslist.services.GameDTOService;

@RestController
@RequestMapping(value = "/dtogames")
public class GameDTOController {
    
    @Autowired
    private GameDTOService service;

    @GetMapping
    public List<GameMinDto> findAll(){
        List<GameMinDto> result = service.findAll();
        return result;
    }

}
