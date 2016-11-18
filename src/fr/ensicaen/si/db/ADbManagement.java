package fr.ensicaen.si.db;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class ADbManagement implements IDbManagement {

	@Override
	public void connexion(String bdd_path) throws SQLException {
		
	}

	@Override
	public void deconnexion() throws SQLException {
		
	}

	@Override
	public ResultSet query(String queryString) throws SQLException {
		return null;
	}

	
}
