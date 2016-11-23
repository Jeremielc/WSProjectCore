package fr.ensicaen.si.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class ADbManagement implements IDbManagement {
	//public static final String NomBase = "jdbc:mysql://localhost/si";
	final String User = "2A";
	final String Password = "2A";
	Connection conn;

	@Override
	public void connection(String bdd_path) throws SQLException {
		
	}

	@Override
	public void disconnection() throws SQLException {
		try {
			conn.close();
		} catch (SQLException ex) {
			ex.printStackTrace(System.err);
		}
	}

	@Override
	public ResultSet query(String queryString) throws SQLException {
		ResultSet res = conn.createStatement().executeQuery(queryString);
		return res;
	}

	
}
