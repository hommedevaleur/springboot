package com.atelier.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atelier.demo.model.Commande;
import com.atelier.demo.model.DetailsCommande;
import com.atelier.demo.repository.CommandeRepository;

@Service
public class CommandeService {

	@Autowired
	private CommandeRepository commandeRepository;
	
	public List<Commande> read(){
		return commandeRepository.findAll();
	}
	
	public Commande create(Commande commande){
		return commandeRepository.save(commande);
	}
	
	public String delete(Long id) {
		commandeRepository.deleteById(id);
		return "Commande supprimée !";
	}
	
	/*public List<String> detailsCommande(){
		return commandeRepository.detailsCommande();
	}*/
	public List<DetailsCommande> detailsCommande(){
		return commandeRepository.detailsCommande();
	}
	
	
}
