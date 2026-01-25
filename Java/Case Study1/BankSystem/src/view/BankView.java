package view;

import model.Transaction;

public class BankView {

    
    public void showMessage(String msg) {
        System.out.println(msg);
    }

    public void showAccountDetails(int id, String type, double balance, boolean active) {
        System.out.println("Account Id : " + id);
        System.out.println("Type : " + type);
        System.out.println("Balance: " + balance);
        System.out.println("Status : " + (active ? "Active" : "Frozen"));
        System.out.println("--------------------------------");
    }

    public void showTransaction(Transaction t) {
    	System.out.println( t.getAccountId() + " \n " + t.getType() + " \n " +t.getAmount() + " \n " +
                t.getDateTime()
            );
    }
}
