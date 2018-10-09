package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.produit;

public interface produitRepository extends JpaRepository<produit, Integer>{

}
