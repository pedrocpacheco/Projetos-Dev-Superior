package com.pedrocpacheco.aulao005;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pedrocpacheco.aulao005.entities.Category;
import com.pedrocpacheco.aulao005.entities.Product;
import com.pedrocpacheco.aulao005.repositories.CategoryRepository;
import com.pedrocpacheco.aulao005.repositories.ProductRepository;

@SpringBootApplication
public class Aulao005Application implements CommandLineRunner{

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(Aulao005Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(null, "Tech");
		Category cat2 = new Category(null, "Books");

		Product p1 = new Product(null, "TV", 2000.0, cat1);
		Product p2 = new Product(null, "DDD", 120.0, cat2);
		Product p3 = new Product(null, "PS5", 2800.0, cat1);
		Product p4 = new Product(null, "Docker", 80.0, cat2);

		cat1.addProducts(Arrays.asList(p1, p3));
		cat1.addProducts(Arrays.asList(p2, p4));
		
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);

		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p4);

	}

}
