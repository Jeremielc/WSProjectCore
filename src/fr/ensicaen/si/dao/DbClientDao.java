package fr.ensicaen.si.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
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
			
			for (Client c : clients) {
				System.out.println(c);
			}
		} catch (SQLException ex) {
			ex.printStackTrace(System.err);
		}

	}

	@Override
	public int countClient() {
		int nbClients = -1;
		try {
			ADbManagement dbMan = new MySqlDbManagement();
			dbMan.connection(MySqlDbManagement.NomBase);
			nbClients = dbMan.query("SELECT COUNT('idNumClient') FROM tabclient;").getInt(0);
			dbMan.disconnection();
		} catch (SQLException ex) {
			ex.printStackTrace(System.err);
		}
		return nbClients;
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
