package fr.ensicaen.si.dao.client;

import java.util.ArrayList;
import java.util.List;

import fr.ensicaen.si.model.Client;

public abstract class AClientDao implements IClientDao {
	
	protected List<Client> clients = new ArrayList<>();
	
	@Override
	public int countClient() {
		return clients.size();
	}

	@Override
	public List<Client> getClients() {
		return clients;
	}

	@Override
	public List<Client> getByName(String name) {
		List<Client> clientByName = new ArrayList<>();
		for (Client c : clients) {
			if (c.getSurname().equals(name)) {
				clientByName.add(c);
			}
		}
		
		return clientByName;
	}

	@Override
	public List<Client> getByFullname(String surname, String name) {
		List<Client> clientByFullname = new ArrayList<>();
		for (Client c : clients) {
			if (c.getName().equals(name) && c.getSurname().equals(surname)) {
				clientByFullname.add(c);
			}
		}
		
		return clientByFullname;
	}

	@Override
	public Client getById(int id) {
		for (Client c : clients) {
			if (c.getId() == id) {
				return c;
			}
		}
		
		return new Client();
	}
}
