package fr.eservices.soaring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity	
public class PointPassage {
	

	@Id
	@GeneratedValue
	int idPointPassage;
	
	String nom;
	String lattitude;
	String longitude;
	String description;
	
	public PointPassage(String nom, String lattitude, String longitude, String description) {
		this.nom = nom;
		this.lattitude = lattitude;
		this.longitude = longitude;
		this.description = description;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLattitude() {
		return lattitude;
	}

	public void setLattitude(String latitude) {
		this.lattitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIdPointPassage() {
		return idPointPassage;
	}

	public void setIdPointPassage(int idPointPassage) {
		this.idPointPassage = idPointPassage;
	}
	
	
}
