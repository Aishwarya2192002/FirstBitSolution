package model;
public abstract class Account {

	int accountId;
	String holderName;
	double balance;
	 boolean active=true;
	public Account(int accountId, String holderName, double balance) {
		super();
		this.accountId = accountId;
		this.holderName = holderName;
		this.balance = balance;
		this.active = true;
	}
	
	public int getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return active;
    }

    public void freeze() {
        active = false;
    }

    public void unfreeze() {
        active = true;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double calculateInterest();
	
}
