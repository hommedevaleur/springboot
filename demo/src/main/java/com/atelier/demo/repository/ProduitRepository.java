package com.atelier.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atelier.demo.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit,Long>{

}
