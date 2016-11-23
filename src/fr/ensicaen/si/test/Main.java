package fr.ensicaen.si.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import fr.ensicaen.si.db.ADbManagement;
import fr.ensicaen.si.db.MySqlDbManagement;

public class Main {

	public static void main(String[] args) {
		MySqlDbManagement mdm = new MySqlDbManagement();
		
		try {
			mdm.connection(ADbManagement.NomBase);
			ResultSet res = mdm.query("show tables");
			while (res.next()) {
				System.out.println(res.getString(1));
			}
			
			res = mdm.query("select * from tabcarte;");
			while (res.next()) {
				System.out.println(res.getString(1));
			}
			
			mdm.disconnection();
		} catch (SQLException ex) {
			ex.printStackTrace(System.err);
		}
	}
}
