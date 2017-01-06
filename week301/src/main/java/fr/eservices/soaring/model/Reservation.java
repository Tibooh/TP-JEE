package fr.eservices.soaring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity	
public class Reservation implements Serializable{
		
	int nbPersonnes;
	
	@Id
	@ManyToOne
	@JoinColumn
	Pilote pilote;
	
	@Id
	@ManyToOne
	@JoinColumn
	Repas repas;
	

	public Reservation(int nbPersonnes) {
		this.nbPersonnes = nbPersonnes;
	}

	public int getNbPersonnes() {
		return nbPersonnes;
	}

	public void setNbPersonnes(int nbPersonnes) {
		this.nbPersonnes = nbPersonnes;
	}

	public Pilote getPilote() {
		return pilote;
	}

	public void setPilote(Pilote pilote) {
		this.pilote = pilote;
	}

	public Repas getRepas() {
		return repas;
	}

	public void setRepas(Repas repas) {
		this.repas = repas;
	}	
	
	
}
