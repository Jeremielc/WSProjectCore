package fr.ensicaen.si.model;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Operation {
	
	private IntegerProperty idProperty, operationTypeProperty;
	private FloatProperty amountProperty;
	private StringProperty cardNumProperty, accountNumProperty, dateProperty;
	
	public Operation() {
		
	}
	
	@Override
	public String toString() {
		String s = getId() + "\t" + getAmount() + "\t" + getCardNum() + "\t" + getAccountNum() + "\t" + getDate();
		return s;
	}

	public int getId() {
		return idProperty.get();
	}

	public float getAmount() {
		return amountProperty.get();
	}

	public String getCardNum() {
		return cardNumProperty.get();
	}

	public String getAccountNum() {
		return accountNumProperty.get();
	}

	public String getDate() {
		return dateProperty.get();
	}
	
	public int getOperationType() {
		return operationTypeProperty.get();
	}
	
	public IntegerProperty idProperty(int id) {
		idProperty = new SimpleIntegerProperty(id);
        return idProperty;
	}
	
	public IntegerProperty operationTypeProperty(int operationType) {
		operationTypeProperty = new SimpleIntegerProperty(operationType);
        return operationTypeProperty;
	}
	
	public FloatProperty amountProperty(float amount) {
		amountProperty = new SimpleFloatProperty(amount);
		return amountProperty;
	}
	
	public StringProperty cardNumProperty(String cardNum) {
		cardNumProperty = new SimpleStringProperty(cardNum);
		return cardNumProperty;
	}
	
	public StringProperty accountNumProperty(String accountNum) {
		accountNumProperty = new SimpleStringProperty(accountNum);
		return accountNumProperty;
	}
	
	public StringProperty dateProperty(String date) {
		dateProperty = new SimpleStringProperty(date);
		return dateProperty;
	}
}
