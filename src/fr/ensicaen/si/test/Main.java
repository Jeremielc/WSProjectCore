package fr.ensicaen.si.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import fr.ensicaen.si.dao.ClientDao;
import fr.ensicaen.si.dao.DbClientDao;
import fr.ensicaen.si.db.ADbManagement;
import fr.ensicaen.si.db.MySqlDbManagement;

public class Main {

	public static void main(String[] args) {
		ADbManagement dbMan = new MySqlDbManagement();
		
		ClientDao cDao = ClientDao.getInstance();
		cDao.setDelegate(new DbClientDao());
		
		/*try {
			/*dbMan.connection(MySqlDbManagement.NomBase);
			ResultSet res = dbMan.query("show tables");
			while (res.next()) {
				System.out.println(res.getString(1));
			}
			
			res = dbMan.query("select * from tabclient;");
			while (res.next()) {
				System.out.println(res.getString(1));
			}
			
			dbMan.disconnection();
		} catch (SQLException ex) {
			ex.printStackTrace(System.err);
		}*/
	}
}
