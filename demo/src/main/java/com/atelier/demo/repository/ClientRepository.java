package com.atelier.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atelier.demo.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
