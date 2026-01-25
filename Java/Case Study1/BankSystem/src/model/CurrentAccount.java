package model;

public class CurrentAccount extends Account{

	double overdraftLimit ;
	public CurrentAccount(int id, String name, double bal, double limit) {
		super(id, name, bal);
		this.overdraftLimit=limit;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		balance=balance+amount;
	}
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(balance + overdraftLimit>=amount)
		{
			balance=balance-amount;
		}
		else
		{
			System.out.println("Over Draft Limit exceeded");
		}
	}
	@Override
	public double calculateInterest() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

}
