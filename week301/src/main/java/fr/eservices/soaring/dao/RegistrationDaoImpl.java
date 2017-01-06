package fr.eservices.soaring.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import fr.eservices.soaring.model.Pilote;
import fr.eservices.soaring.model.Repas;

public class RegistrationDaoImpl implements RegistrationDao{
	EntityManager em;
	
	@Override
	public void setEntityManager(EntityManager em) {	
			this.em = em;			
	}
	
	@Override
	public List<Pilote> findPilotsByName(String nom) {
		
		List<Pilote> resultat =
				em.createQuery("SELECT * FROM Pilote WHERE nom = :nom", Pilote.class)
				.setParameter("nom", nom)
				.getResultList();
			
			if ( resultat.isEmpty() )
				return null;
						
		return resultat;	
	}

	@Override
	public List<Pilote> findPilotsByRegion(int id_region) {
		List<Pilote> resultat =
				em.createQuery("SELECT e FROM Pilote p INNER JOIN Club c INNER JOIN Region r WHERE r.id = :id", Pilote.class)
				.setParameter("id", id_region)
				.getResultList();
			
			if ( resultat.isEmpty() )
				return null;
			
			return resultat;	
	}

	@Override
	public List<Pilote> findPilotsByClub(int id_club) {
		return null;
	}

	@Override
	public List<Pilote> findPilotsBelow(Date currentDate, int age) {
		return null;
	}

	@Override
	public Map<Repas, Integer> getAvailableSeatsForLunch(Date day, String time) {
		return null;
	}



}
