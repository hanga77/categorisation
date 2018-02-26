package cm.skydev.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cm.skydev.entites.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long>{

	public default Categorie suppression(String code){
		Categorie cat = null ;
		cat.setEtat(true);
		return this.saveAndFlush(cat);
	}
	
	@Query("select c from Categorie c where c.nom = :nom")
	public boolean categorie(@Param("nom") String nom);
	
	@Query("select c from Categorie c where c.nom = :nom")
	public boolean categories(@Param("nom") String nom);
}
