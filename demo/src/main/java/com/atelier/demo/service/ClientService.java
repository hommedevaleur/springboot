package com.atelier.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atelier.demo.model.Client;
import com.atelier.demo.repository.ClientRepository;

import lombok.Data;

@Service
@Data
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	public List<Client> read(){
		return clientRepository.findAll();
	}
	
	public Client create(Client client) {
		return clientRepository.save(client);
	}
	
	public String delete(Long id) {
		clientRepository.deleteById(id);
		return "Client supprimé !";
	}
}
