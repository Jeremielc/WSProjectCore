package fr.ensicaen.si.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import fr.ensicaen.si.dao.ClientDao;
import fr.ensicaen.si.dao.DbClientDao;
import fr.ensicaen.si.db.ADbManagement;
import fr.ensicaen.si.db.MySqlDbManagement;
import fr.ensicaen.si.model.Client;

public class Main {

	public static void main(String[] args) {
		ADbManagement dbMan = new MySqlDbManagement();
		
		ClientDao cd = ClientDao.getInstance();
		System.out.println(cd.isDelegated() == false ? "Pas de delegué." : "Correctement délègué.");
		
		cd.setDelegate(new DbClientDao());
		System.out.println(cd.isDelegated() == false ? "Pas de delegué." : "Correctement délègué.");
		
		System.out.println(cd.countClient());
		
		System.out.println(cd.getById(55));
		
		System.out.println(cd.getByFullname("Béatrice", "Innocent").get(0));
		
		List<Client> bea = cd.getByName("Innocent");
		for (Client c : bea) {
			System.out.println(c);
		}
	}
}
