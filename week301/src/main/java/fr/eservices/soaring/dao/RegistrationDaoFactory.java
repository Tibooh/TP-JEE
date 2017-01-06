package fr.eservices.soaring.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RegistrationDaoFactory {

	public static RegistrationDao createRegistrationDao() {
		//throw new RuntimeException("Not Yet implemented");	
		EntityManagerFactory emf = null;
		RegistrationDao dao;
		try {
			emf = Persistence.createEntityManagerFactory("myApp");
			dao = new RegistrationDaoImpl();
			dao.setEntityManager(emf.createEntityManager());
			
		} finally {		
			emf.close();
		}
		
		return dao;
	}
	
	

	
}
