package controller;

import model.*;
import view.BankView;

public class BankController {

   BankModel model;
   BankView view;   
   public BankController (BankModel model) {
	   this.model=model;
	   this.view = new BankView();
   }
   public void createAccount(Account acc) {
	// TODO Auto-generated method stub
	model.addAccount(acc);
	System.out.println("Account Created Sucessfully");
   }
public void deposite(int id, double amt) {
	// TODO Auto-generated method stub
	Account acc=model.findAccount(id);
	if(acc !=null && acc.isActive())
	{
		acc.deposit(amt);
		model.addTransaction(new Transaction(id,"Deposit",amt));
		view.showMessage("Balance= "+acc.getBalance());
		
	}
	else
	{
		System.out.println("Account not found");
	}
}
public void withdraw(int id, double amt) {
	// TODO Auto-generated method stub
	Account acc=model.findAccount(id);
	if(acc !=null && acc.isActive()) {
		acc.withdraw(amt);
		model.addTransaction(new Transaction(id, "Withdraw", amt));
		view.showMessage("Balance = " + acc.getBalance());
	}
	else {
		System.out.println("Account not found");
	}
}
public void transfer(int fromId, int toId, double amount) {
    Account from = model.findAccount(fromId);
    Account to = model.findAccount(toId);

    if (from != null && to != null && from.isActive() && to.isActive()) {
        from.withdraw(amount);
        to.deposit(amount);

        model.addTransaction(new Transaction(fromId, "Transfer-Out", amount));
        model.addTransaction(new Transaction(toId, "Transfer-In", amount));

        System.out.println("Transfer Successful");
    } else {
        System.out.println("Invalid accounts or inactive account");
    }
}

public void applyMonthlyInterest() {
    Account[] arr = model.getAllAccounts();
    int count = model.getAccountCount();

    for (int i = 0; i < count; i++) {
        if (arr[i].isActive()) {
            double interest = arr[i].calculateInterest();
            arr[i].deposit(interest);
        }
    }
    System.out.println("Monthly interest applied");
}

public void endOfDayReport() {
    showAllTransactions();
}

public void listAccounts() {
    Account[] arr = model.getAllAccounts();
    int count = model.getAccountCount();

    for (int i = 0; i < count; i++) {
        Account acc = arr[i];
        view.showMessage(acc.getAccountId() + " | " +acc.getClass().getSimpleName() +
                           " | Balance: " + acc.getBalance());
    }
}

public void showAccountStatus(int id) {
    Account acc = model.findAccount(id);

    if (acc != null) {
        if (acc.isActive())
            System.out.println("Account is Active");
        else
            System.out.println("Account is Frozen / Closed");
    } else {
        System.out.println("Account not found");
    }
}

public void showAccountTransactions(int id) {
    Transaction[] arr = model.getAllTransactions();
    int count = model.getTransactionCount();

    for (int i = 0; i < count; i++) {
        if (arr[i].getAccountId() == id) {
            System.out.println(arr[i]);
        }
    }
}

public void showAllTransactions() {
    Transaction[] arr = model.getAllTransactions();
    int count = model.getTransactionCount();

    for (int i = 0; i < count; i++) {
        System.out.println(arr[i]);
    }
}

public void calculateLoanEMI(int id, int months) {
    Account acc = model.findAccount(id);

    if (acc instanceof LoanAccount) {
        double loanAmount = -acc.getBalance();
        double rate = 0.08 / 12;

        double emi = (loanAmount * rate * Math.pow(1 + rate, months)) /
                     (Math.pow(1 + rate, months) - 1);

        System.out.println("Monthly EMI = " + emi);
    } else {
        System.out.println("This is not a loan account");
    }
}

public void freezeAccount(int id) {
    Account acc = model.findAccount(id);
    if (acc != null) {
        acc.freeze();
        System.out.println("Account Frozen");
    }
}

public void unfreezeAccount(int id) {
    Account acc = model.findAccount(id);
    if (acc != null) {
        acc.unfreeze();
        System.out.println("Account Unfrozen");
    }
}

public void closeAccount(int id) {
    Account acc = model.findAccount(id);
    if (acc != null) {
        acc.freeze();
        System.out.println("Account Closed Successfully");
    }
   }
}

   

