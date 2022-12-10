package com.atelier.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="PRODUIT")
@Data
public class Produit {

	@jakarta.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
private long Id;
	@Column(length=50)
	private String nom;
	@Column(length=150)
	private String description;
	private Integer prix;
}
