package model;

public class LoanAccount extends Account{

	public LoanAccount(int id, String name, double loanAmount) {
		super(id, name, -loanAmount);
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
		System.out.println("Not Allowed Withdraw");
	}

	@Override
	public double calculateInterest() {
		// TODO Auto-generated method stub
		return balance* 0.08;
	}

	

}
