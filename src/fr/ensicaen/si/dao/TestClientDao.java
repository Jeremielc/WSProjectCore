package fr.ensicaen.si.dao;

import fr.ensicaen.si.dao.client.AClientDao;
import fr.ensicaen.si.model.Client;

public class TestClientDao extends AClientDao {
	public TestClientDao(){
		Client c = new Client(101,"Hue","Pierrick");
		clients.add(1,c);
		
		c = new Client(102,"Leclerc","Jeremie");
		clients.add(2,c);
		
		c = new Client(103, "Holly", "Wood", "Mme", "France", "13 rue de la chapelle - Bayeux", 14400);
		clients.add(103, c);
	}
}
