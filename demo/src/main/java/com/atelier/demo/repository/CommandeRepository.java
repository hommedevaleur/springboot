package com.atelier.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.atelier.demo.model.Commande;
import com.atelier.demo.model.DetailsCommande;

public interface CommandeRepository extends JpaRepository<Commande,Long>{

	
/*@Query(value ="SELECT c.nom, a.libelle " 
		+"FROM COMMANDE co "
		+ "INNER JOIN article a ON co.article_id=a.id "
		+"INNER JOIN client c ON co.client_id = c.id",nativeQuery = true
)
*/

//public List<String> detailsCommande();
	@Query("SELECT new com.atelier.demo.model.DetailsCommande(c.nom, a.libelle) " 
			+"FROM Commande co "
			+ "JOIN co.article_id a "
			+"JOIN co.client_id c.id"
	)
public List<DetailsCommande> detailsCommande();	
	
}
