package fr.eservices.soaring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity	
public class Secteur implements Serializable{
	
	String rayon;
	String type;
	
	@Id
	@ManyToOne
	@JoinColumn
	Epreuve epreuve;
	
	@Id
	@ManyToOne
	@JoinColumn
	PointPassage pointpassage;
	
	public Secteur(String rayon, String type) {
		this.rayon = rayon;
		this.type = type;
	}

	public String getRayon() {
		return rayon;
	}

	public void setRayon(String rayon) {
		this.rayon = rayon;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public Epreuve getEpreuve() {
		return epreuve;
	}

	public void setEpreuve(Epreuve epreuve) {
		this.epreuve = epreuve;
	}

	public PointPassage getPointpassage() {
		return pointpassage;
	}

	public void setPointpassage(PointPassage pointpassage) {
		this.pointpassage = pointpassage;
	}
	
	
	
	

}
