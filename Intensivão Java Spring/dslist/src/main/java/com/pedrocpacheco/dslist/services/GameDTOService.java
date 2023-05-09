package com.pedrocpacheco.dslist.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedrocpacheco.dslist.dto.GameMinDto;
import com.pedrocpacheco.dslist.entities.Game;
import com.pedrocpacheco.dslist.repository.GameRepository;

@Service
public class GameDTOService {
    
    @Autowired // Inicializando automaticamente
    private GameRepository repository; // Injetando o GameRepository

    public List<GameMinDto> findAll(){
        List<Game> result = repository.findAll();
        List<GameMinDto> resultDto = new ArrayList<>();

        // Não tem como usar MF pois tem logica 
        result.forEach(game -> resultDto.add(new GameMinDto(game)));

        // Mas pode-se usar os streams
        return result.stream().map(GameMinDto::new).collect(Collectors.toList());
    }

}
