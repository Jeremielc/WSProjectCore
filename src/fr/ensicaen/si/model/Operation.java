package fr.ensicaen.si.model;

public class Operation {

	private int id;
	private float amount;
	private String cardNum;
	private String accountNum;
	private String date;
	
	public Operation() {
		
	}
	
	@Override
	public String toString() {
		String s = id + "\t" + amount + "\t" + cardNum + "\t" + accountNum + "\t" + date;
		return s;
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
}
