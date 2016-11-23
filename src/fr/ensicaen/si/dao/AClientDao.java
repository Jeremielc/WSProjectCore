package fr.ensicaen.si.dao;

import java.util.ArrayList;
import java.util.List;

import fr.ensicaen.si.model.Client;

public abstract class AClientDao implements IClientDao {
	
	protected List<Client> clients = new ArrayList<>();
}
