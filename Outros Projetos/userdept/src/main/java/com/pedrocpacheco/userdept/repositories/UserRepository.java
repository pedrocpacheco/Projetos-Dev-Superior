package com.pedrocpacheco.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrocpacheco.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
