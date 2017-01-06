package fr.eservices.soaring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity	
public class Vol {
	
		@Id
		@GeneratedValue
		int idVol;
		
		String date;
		String heureDecollage;
		String heureAtterrissage;
		
		@ManyToOne
		Pilote pilote;
		
		@ManyToOne
		Epreuve epreuve;
		
		public Vol(String date, String heureDecollage, String heureAtterrissage) {
			this.date = date;
			this.heureDecollage = heureDecollage;
			this.heureAtterrissage = heureAtterrissage;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getHeureDecollage() {
			return heureDecollage;
		}

		public void setHeureDecollage(String heureDecollage) {
			this.heureDecollage = heureDecollage;
		}

		public String getHeureAtterrissage() {
			return heureAtterrissage;
		}

		public void setHeureAtterrissage(String heureAtterrissage) {
			this.heureAtterrissage = heureAtterrissage;
		}

		public int getIdVol() {
			return idVol;
		}

		public void setIdVol(int idVol) {
			this.idVol = idVol;
		}

		public Pilote getPilote() {
			return pilote;
		}

		public void setPilote(Pilote pilote) {
			this.pilote = pilote;
		}

		public Epreuve getEpreuve() {
			return epreuve;
		}

		public void setEpreuve(Epreuve epreuve) {
			this.epreuve = epreuve;
		}
		
		
}
