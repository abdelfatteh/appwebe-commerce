package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.produitRepository;
import com.example.demo.entity.produit;

@RestController
public class produitRestservice {
	@Autowired
private produitRepository produitRepository ;
	@RequestMapping(value="/produits",method=RequestMethod.GET)
	public List<produit> listeproduit(){
		return produitRepository.findAll();
	}
}
