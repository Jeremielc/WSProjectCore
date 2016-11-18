package fr.ensicaen.si.db;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface IDbManagement {

	void connexion(String bdd_path) throws SQLException;
	void deconnexion() throws SQLException;
	ResultSet query(String queryString) throws SQLException;
}
