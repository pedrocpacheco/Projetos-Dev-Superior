package com.pedrocpacheco.aulao005;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pedrocpacheco.aulao005.entities.Category;
import com.pedrocpacheco.aulao005.repositories.CategoryRepository;

@SpringBootApplication
public class Aulao005Application implements CommandLineRunner{

	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Aulao005Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		categoryRepository.save(new Category(1L, "Pedro"));
		categoryRepository.save(new Category(2L, "Luane"));
	}

}
