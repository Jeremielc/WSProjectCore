package fr.ensicaen.si.dao;

import java.util.List;

import fr.ensicaen.si.model.Client;

public class ClientDao implements IClientDao {
	
	public static ClientDao instance;
	private IClientDao delegate;

	private ClientDao() {
		
	}
	
	public ClientDao getInstance() {
		if (instance == null) {
			instance = new ClientDao();
		}
		
		return instance;
	}
	
	public void setDelegate(IClientDao delegate) {
		this.delegate = delegate;
	}
	
	public boolean isDelegated() {
		return !(delegate == null);
	}

	@Override
	public int countClient() {
		return 0;
	}

	@Override
	public List<Client> getClients() {
		return null;
	}

	@Override
	public List<Client> getByName(String name) {
		return null;
	}

	@Override
	public List<Client> getByFullname(String surname, String name) {
		return null;
	}

	@Override
	public Client getById(int id) {
		return null;
	}
	
	
}
