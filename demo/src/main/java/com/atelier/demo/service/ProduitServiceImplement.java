package com.atelier.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atelier.demo.model.Produit;
import com.atelier.demo.repository.ProduitRepository;

import lombok.Data;

@Service
@Data
public class ProduitServiceImplement implements ProduitService{
	
	@Autowired
	private final ProduitRepository produitRepository;

	@Override
	public Produit creer(Produit produit) {
		// TODO Auto-generated method stub
		return produitRepository.save(produit);
	}

	@Override
	public List<Produit> lire() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}

	@Override
	public Produit modifier(Produit produit, Long id) {
		// TODO Auto-generated method stub
		return produitRepository.findById(id)
				.map(p->{
					p.setNom(produit.getNom());
					p.setDescription(produit.getDescription());
					p.setPrix(produit.getPrix());
					return produitRepository.save(p);
				}).orElseThrow(()->new RuntimeException("Produit non trouvé !"));
						
	}

	@Override
	public String supprimer(Long id) {
		// TODO Auto-generated method stub
		produitRepository.deleteById(id);
		return "Produit supprimé !";
	}

}
