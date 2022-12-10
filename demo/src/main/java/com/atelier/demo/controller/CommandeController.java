package com.atelier.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atelier.demo.model.DetailsCommande;
import com.atelier.demo.service.CommandeService;

@RestController
public class CommandeController {
	@Autowired
	private CommandeService commandeService;
	

	@GetMapping("/commande/details")
	public List<DetailsCommande> detailsCommande(){
	 return commandeService.detailsCommande();	
	}
}
