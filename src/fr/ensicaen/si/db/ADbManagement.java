package fr.ensicaen.si.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class ADbManagement implements IDbManagement {
	final String User = "2A";
	final String Password = "2A";
	Connection conn;

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
