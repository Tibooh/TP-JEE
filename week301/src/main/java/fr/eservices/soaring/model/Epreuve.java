package fr.eservices.soaring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity	
public class Epreuve {
	

	@Id
	@GeneratedValue
	int id;
	
	String jour;
	String status;
	String type;
//	enum status {PREVU, ANNULE, PROVISOIRE, NONOFFICIEL, OFFICIEL};
//	enum type {AAT, AST};
	
	public Epreuve(String jour, String status, String type) {
		this.jour = jour;
		this.status = status;
		this.type = type;
	}

	public String getJour() {
		return jour;
	}

	public void setJour(String jour) {
		this.jour = jour;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
