package fr.ensicaen.si.dao;

import java.util.List;

import fr.ensicaen.si.model.Client;

public interface IClientDao {
	
	int countClient();
	List<Client> getClients();
	List<Client> getByName(String name);
	List<Client> getByFullname(String surname, String name);
	Client getById(int id);
}
