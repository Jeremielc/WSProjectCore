package fr.ensicaen.si.model;

public class Client {

	private String address, civility, country, name, surname;
	private int id, zipcode;
	
	public Client(){
		
	}

	@Override
	public String toString() {
		return new String(id + "\t\t" + surname + "\t\t" + name);

	}

	public String getAddress() {
		return address;
	}

	public String getCivility() {
		return civility;
	}

	public String getCountry() {
		return country;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getId() {
		return id;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCivility(String civility) {
		this.civility = civility;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
}
