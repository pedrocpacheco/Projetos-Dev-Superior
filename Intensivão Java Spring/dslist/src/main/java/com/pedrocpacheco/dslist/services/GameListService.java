package com.pedrocpacheco.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pedrocpacheco.dslist.dto.GameListDTO;
import com.pedrocpacheco.dslist.entities.GameList;
import com.pedrocpacheco.dslist.projections.GameMinProjection;
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

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex){
        List<GameMinProjection> list = gameRepository.searchByList(listId);
        GameMinProjection removed = list.remove(sourceIndex);
        list.add(destinationIndex, removed);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for (int i = min; i < max; i++){
            repository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }

    }

}
