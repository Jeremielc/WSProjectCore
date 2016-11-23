package fr.ensicaen.si.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.ensicaen.si.db.ADbManagement;
import fr.ensicaen.si.db.MySqlDbManagement;
import fr.ensicaen.si.model.Client;

public class DbClientDao extends AClientDao {

	public DbClientDao() {
		try {
			ADbManagement dbMan = new MySqlDbManagement();
			dbMan.connection(MySqlDbManagement.NomBase);
			ResultSet res = dbMan.query("select * from tabclient");
			
			while (res.next()) {
				Client temp = new Client();
				temp.setId(res.getInt(1));
				temp.setName(res.getString(3));
				temp.setSurname(res.getString(4));
				clients.add(temp);
			}

			dbMan.disconnection();
		} catch (SQLException ex) {
			ex.printStackTrace(System.err);
		}
	}

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
			if (c.getName().equals(name)) {
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
