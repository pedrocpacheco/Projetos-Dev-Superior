package com.pedrocpacheco.dslist.services;

import java.util.ArrayList;
import java.util.List;

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

        // Criando Lista de Games
        List<Game> result = repository.findAll();

        // Passando lista de games para Lista de GameMinDto
        List<GameMinDto> resultDto = new ArrayList<>();

        // Pode-se usar Lambda (method reference somente não)
        result.forEach(game -> resultDto.add(new GameMinDto(game)));

        // Mas pode-se usar os streams
        return result.stream().map(GameMinDto::new).toList();
    }

}
