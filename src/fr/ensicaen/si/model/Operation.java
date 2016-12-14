package fr.ensicaen.si.model;

import javax.xml.bind.annotation.XmlRootElement;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

@XmlRootElement
public class Operation {
	
	private final IntegerProperty id, operationType;
	private final FloatProperty amount;
	private final StringProperty cardNum, accountNum, date;

	public Operation() {
		id = new SimpleIntegerProperty();
		operationType = new SimpleIntegerProperty();
		amount = new SimpleFloatProperty();
		cardNum = new SimpleStringProperty();
		accountNum = new SimpleStringProperty();
		date = new SimpleStringProperty();
	}
	
	public Operation(int id, int operationType, float amount, String cardNum, String accountNum, String date) {
		this.id = new SimpleIntegerProperty(id);
		this.operationType = new SimpleIntegerProperty(operationType);
		this.amount = new SimpleFloatProperty(amount);
		this.cardNum = new SimpleStringProperty(cardNum);
		this.accountNum = new SimpleStringProperty(accountNum);
		this.date = new SimpleStringProperty(date);
	}
	
	@Override
	public String toString() {
		String s = getId() + "\t" 
				+ getOperationType() + "\t" 
				+ getAmount() + "\t" 
				+ getCardNum() + "\t" 
				+ getAccountNum() + "\t" 
				+ getDate();
		return s;
	}

	public IntegerProperty id() {
		return id;
	}

	public IntegerProperty operationType() {
		return operationType;
	}

	public FloatProperty amount() {
		return amount;
	}

	public StringProperty cardNum() {
		return cardNum;
	}

	public StringProperty accountNum() {
		return accountNum;
	}

	public StringProperty date() {
		return date;
	}
	
	public int getId() {
		return this.id.get();
	}
	
	public int getOperationType() {
		return this.operationType.get();
	}
	
	public float getAmount() {
		return this.amount.get();
	}
	
	public String getCardNum() {
		return this.cardNum.get();
	}
	
	public String getAccountNum() {
		return this.accountNum.get();
	}
	
	public String getDate() {
		return this.date.get();
	}
	
	public void setId(int id) {
		this.id.set(id);
	}
	
	public void setOperationType(int operationtype) {
		this.operationType.set(operationtype);
	}
	
	public void setAmount(float amount) {
		this.amount.set(amount);
	}
	
	public void setCardNum(String cardNum) {
		this.cardNum.set(cardNum);
	}
	
	public void setAccountNum(String accountNum) {
		this.accountNum.set(accountNum);
	}
	
	public void setDate(String date) {
		this.date.set(date);
	}
}
