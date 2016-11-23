package fr.ensicaen.si.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Operation {

	private int id;
	private float amount;
	private String cardNum;
	private String accountNum;
	private String date;
	private String merchantNum;
	private String gabNum;
	private String typeOperationNum;
	

	public Operation() {
		
	}
	
	public Operation(int id, String merchantNum,String gabNum,String cardNum,String accountNum,String typeOperationNum, String date,float amount){
		this.id = id;
		this.merchantNum = merchantNum;
		this.gabNum = gabNum;
		this.cardNum = cardNum;
		this.accountNum = accountNum;
		this.typeOperationNum = typeOperationNum;
		this.date = date;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public float getAmount() {
		return amount;
	}

	public String getCardNum() {
		return cardNum;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public String getDate() {
		return date;
	}
	
	public String getGabNum() {
		return gabNum;
	}
	
	public String getMerchantNum() {
		return merchantNum;
	}
	
	public String getTypeOperationNum() {
		return typeOperationNum;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public void setMerchantNum(String merchantNum) {
		this.merchantNum = merchantNum;
	}
	
	public void setGabNum(String gabNum) {
		this.gabNum = gabNum;
	}
	
	public void setTypeOperationNum(String typeOperationNum) {
		this.typeOperationNum = typeOperationNum;
	}
	
	@Override
	public String toString() {
		return new String(id + "\t" + cardNum + "\t" + amount + "\t" + date);
	}
}
