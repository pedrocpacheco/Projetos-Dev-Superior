package com.pedrocpacheco.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrocpacheco.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
    
}
