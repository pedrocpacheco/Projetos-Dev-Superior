package com.pedrocpacheco.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pedrocpacheco.dslist.dto.GameDTO;
import com.pedrocpacheco.dslist.dto.GameMinDTO;
import com.pedrocpacheco.dslist.entities.Game;
import com.pedrocpacheco.dslist.projections.GameMinProjection;
import com.pedrocpacheco.dslist.repository.GameRepository;

@Service
public class GameService {
    
    @Autowired // Inicializando automaticamente
    private GameRepository repository; // Injetando o GameRepository

    @Transactional(readOnly = true) // Boa pratica, diz que so estamos lendo
    public GameDTO findById(Long id){ 
        GameDTO gameDTO = new GameDTO(repository.findById(id).get());
        return gameDTO;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = repository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> finByList(Long listId){
        List<GameMinProjection> resultList = repository.searchByList(listId);
        return resultList.stream().map(GameMinDTO::new).toList(); // Cria GameMinDtos, com base nos GameMinProjections, que nada mais são, do que DTOS formados com base na chamada especifica do BD
    }
}
