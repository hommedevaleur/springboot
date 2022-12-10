package com.atelier.demo.service;

import java.util.List;

import com.atelier.demo.model.Produit;

public interface ProduitService {
	
	//Fonction pour créer un nouveau produit->retourne un Produit
	Produit creer(Produit produit);
	
	//Fonction pour lire tous les produits->retourne une liste de Produit
	List<Produit> lire();
	
	//Fonction pour faire la mise à jour d'un produit -> retourne un produit
	Produit modifier(Produit produit, Long id);
	
	//FOnction pour supprimer un produit-> retourne une chaine de caractère
	String supprimer (Long id);
	

}
