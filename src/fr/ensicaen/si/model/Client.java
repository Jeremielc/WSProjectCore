package fr.ensicaen.si.model;

public class Client {
	
	private int id;
	private String name;
	private String surname;
	
	public Client() {
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	@Override
	public String toString() {
		return new String(id + "\t" + name + "\t" + surname);
	}
}
