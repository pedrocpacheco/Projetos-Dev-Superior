package com.pedrocpacheco.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrocpacheco.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
    
}
