package cm.skydev.entites;

import javax.persistence.*;

@Entity
public class Categorie {

	@Id @GeneratedValue
	private long id;
	private String nom;
	private String code;
	private boolean etat;
	
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categorie(String nom, String code) {
		super();
		this.nom = nom;
		this.code = code;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public boolean isEtat() {
		return etat;
	}
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	
	
	
}
