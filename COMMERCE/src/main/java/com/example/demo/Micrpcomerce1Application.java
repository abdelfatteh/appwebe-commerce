package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.demo.dao.produitRepository;
import com.example.demo.entity.produit;


@SpringBootApplication

public class Micrpcomerce1Application implements CommandLineRunner{
	@Autowired
     private produitRepository produitRepository ;
	public static void main(String[] args) {
		SpringApplication.run(Micrpcomerce1Application.class, args);
		
	}
	

	@Override
	public void run(String... args) throws Exception {
		/*produitRepository.save(new produit(1,"SAMSUNG",700,5,"france"));
		produitRepository.save(new produit(2,"DELL",780,4,"allemagne"));
		produitRepository.save(new produit(3,"Acer",800,7,"allemagne"));
		*/
	    

		
	}
	
	}
	
	

