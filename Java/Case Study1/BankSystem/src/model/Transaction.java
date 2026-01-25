package model;


import java.time.LocalDateTime;

public class Transaction {

	int accountId;
	String type;
	double amount;
	LocalDateTime dateTime;
	

	public Transaction(int accountId, String type, double amount) {
		super();
		this.accountId = accountId;
		this.type = type;
		this.amount = amount;
		this.dateTime = LocalDateTime.now();
	}

	 public int getAccountId() {
	        return accountId;
	    }
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return accountId + "|"+type+"|"+amount+"|"+dateTime;
	}

	public int getType() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getDateTime() {
		// TODO Auto-generated method stub
		return 0;
	}
}

