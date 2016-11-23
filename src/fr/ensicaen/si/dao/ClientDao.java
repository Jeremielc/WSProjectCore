package fr.ensicaen.si.dao;

import java.util.List;

import fr.ensicaen.si.model.Client;

public class ClientDao implements IClientDao {
	
	public static ClientDao instance;
	private IClientDao delegate;

	private ClientDao() {
		
	}
	
	public static ClientDao getInstance() {
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
		return delegate.countClient();
	}

	@Override
	public List<Client> getClients() {
		return delegate.getClients();
	}

	@Override
	public List<Client> getByName(String name) {
		return delegate.getByName(name);
	}

	@Override
	public List<Client> getByFullname(String surname, String name) {
		return delegate.getByFullname(surname, name);
	}

	@Override
	public Client getById(int id) {
		return delegate.getById(id);
	}
	
	
}
