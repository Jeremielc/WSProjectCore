package fr.ensicaen.si.model;

public class Operation {

	private int id;
	private float amount;
	private String cardNum;
	private String accountNum;
	private String date;
	private int merchantNum;
	private int gabNum;
	private int typeOperationNum;
	

	public Operation() {
		
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
	
	public int getGabNum() {
		return gabNum;
	}
	
	public int getMerchantNum() {
		return merchantNum;
	}
	
	public int getTypeOperationNum() {
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
	
	public void setMerchantNum(int merchantNum) {
		this.merchantNum = merchantNum;
	}
	
	public void setGabNum(int gabNum) {
		this.gabNum = gabNum;
	}
	
	public void setTypeOperationNum(int typeOperationNum) {
		this.typeOperationNum = typeOperationNum;
	}
	
	@Override
	public String toString() {
		return new String(id + "\t" + cardNum + "\t" + amount + "\t" + date);
	}
}
