import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.eservices.soaring.dao.RegistrationDao;
import fr.eservices.soaring.dao.RegistrationDaoFactory;
import fr.eservices.soaring.dao.RegistrationDaoImpl;
import fr.eservices.soaring.model.Pilote;

public class App {
	
	public static void main(String[] args) throws Exception {
		
		EntityManagerFactory emf = null;
		try {
			emf = Persistence.createEntityManagerFactory("myApp");
			RegistrationDao dao = new RegistrationDaoImpl();
			dao.setEntityManager(emf.createEntityManager());
			
			
			List<Pilote> pilots = dao.findPilotsByName("Thomas");
			for (Pilote p : pilots){
				System.out.println(p.getPrenom());
			}
		} finally {		
			emf.close();
		}
	}

}