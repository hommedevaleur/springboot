package com.atelier.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atelier.demo.model.Client;
import com.atelier.demo.service.ClientService;

@RestController
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@GetMapping("/client/")
	public List<Client> read(){
		return clientService.read();
	}
	
	@PostMapping("/client/create")
	public Client create(@RequestBody Client client) {
		return clientService.create(client);
	}
}
