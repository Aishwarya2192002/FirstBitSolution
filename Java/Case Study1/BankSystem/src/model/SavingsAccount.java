package model;

public class SavingsAccount extends Account {
	
	public SavingsAccount(int id, String name, double bal) {
        super(id, name, bal);
    }

    public void deposit(double amount) {
        balance =balance+ amount;
    }

    public void withdraw(double amount) {
        if (balance + amount > 10000) {
            System.out.println("Minimum balance maintain 10000");
        } else {
            balance =balance- amount;
        }
    }

    public double calculateInterest() {
        return balance * 0.04;
    }
	
}
