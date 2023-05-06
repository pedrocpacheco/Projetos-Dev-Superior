package com.pedrocpacheco.aulao005.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pedrocpacheco.aulao005.entities.Category;

// 1 - Com JPA, todos os Repositorys são interfaces.
@Repository // 2- É preciso utilizar o @Repository // 3- Precisa dizer o tipo e o ID
public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}