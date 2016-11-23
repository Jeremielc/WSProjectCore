package fr.ensicaen.si.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Client {
	
	//@XmlElement(name="id")
	private int id;
	private String civility;
	private String name;
	private String surname;
	private String address;
	private int zipcode;
	private String country;
	
	public Client(){
		
	}
	
	public Client(int id,String name,String surname) {
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	
	public Client(int id, String civility, String name,String surname, String address, int zipcode, String country) {
		this.id = id;
		this.civility = civility;
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.zipcode = zipcode;
		this.country = country;
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

	public String getCountry() {
		return country;
	}
	
	public String getCivility() {
		return civility;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getZipcode() {
		return zipcode;
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

	public void setCivility(String civility) {
		this.civility = civility;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return new String(id + "\t" + name + "\t" + surname);
	}
}
