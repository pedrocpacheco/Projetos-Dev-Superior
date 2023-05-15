package com.pedrocpacheco.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pedrocpacheco.dslist.dto.GameListDTO;
import com.pedrocpacheco.dslist.entities.GameList;
import com.pedrocpacheco.dslist.repository.GameListRepository;
import com.pedrocpacheco.dslist.repository.GameRepository;

@Service
public class GameListService {
    
    @Autowired
    private GameListRepository repository;

    @Autowired
    private GameRepository gameRepository;

    public List<GameList> findAll(){
        List<GameList> result = repository.findAll();
        return result;
    }

    @Transactional(readOnly = true)
    public GameListDTO findById(Long id){
        GameListDTO result = new GameListDTO(repository.findById(id).get());
        return result;
    }

    public void move(Long id, int sourceIndex, int destinationIndex){
        List<GameMinProjection> list = gameRepository.searchByList(id);
    }

}
