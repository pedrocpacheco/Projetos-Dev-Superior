package com.pedrocpacheco.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedrocpacheco.dslist.dto.GameMinDto;
import com.pedrocpacheco.dslist.services.GameDTOService;

@RestController
@RequestMapping(value = "/dtogames")
public class GameDTOController {
    
    @Autowired
    private GameDTOService service;

    
    public List<GameMinDto> findAll(){
        return null;
    }

}
