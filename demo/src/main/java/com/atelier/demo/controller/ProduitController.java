package com.atelier.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atelier.demo.model.Produit;
import com.atelier.demo.service.ProduitServiceImplement;

@RestController
public class ProduitController {

@Autowired
private ProduitServiceImplement produitServiceImplement;

@PostMapping("/create")
public Produit create(@RequestBody Produit produit) {
	return produitServiceImplement.creer(produit);
}

@GetMapping("/")
public List<Produit> read(){
	return produitServiceImplement.lire();
}

@PutMapping("/update/{id}")
public Produit update(@RequestBody Produit produit, @PathVariable Long id) {
	return produitServiceImplement.modifier(produit,id);
}

@DeleteMapping("/delete/{id}")
public String delete (@PathVariable Long id) {
	return produitServiceImplement.supprimer(id);
}

}
