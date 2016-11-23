package fr.ensicaen.si.dao;

import java.util.List;

import fr.ensicaen.si.model.Client;

public class TestClientDao extends AClientDao {
	public TestClientDao(){
		Client c = new Client(101,"Hue","Pierrick");
		clients.add(1,c);
		c = new Client(102,"Leclerc","Jeremie");
		clients.add(2,c);
		c = new Client(103,"Mme","Holly","Wood","13 rue de la chapelle",14400,"Bayeux");
		clients.add(103, c);
	}

	@Override
	public int countClient() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Client> getClients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> getByFullname(String surname, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
