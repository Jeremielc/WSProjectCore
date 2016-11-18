package fr.ensicaen.si.db;

public class DbManagement {

	public static DbManagement instance = new DbManagement();
	private ADbManagement delegate;
	
	private DbManagement() {
		
	}
	
	public DbManagement getInstance() {
		return instance;
	}
	
	public void setDelegate(ADbManagement delegate) {
		this.delegate = delegate;
	}
}
