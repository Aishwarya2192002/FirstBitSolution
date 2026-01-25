package model;

import java.util.ArrayList;

public class BankModel {

	Account[]accounts=new Account[100];
	Transaction[]transaction=new Transaction[1000];
	
	int accCount=0;
	int txnCount=0;
	public void addAccount(Account acc) {
        accounts[accCount++] = acc;
    }

    public Account findAccount(int id) {
        for (int i = 0; i < accCount; i++) {
            if (accounts[i].getAccountId() == id)
                return accounts[i];
        }
        return null;
    }

    public void addTransaction(Transaction t) {
        transaction[txnCount++] = t;
    }

    public Account[] getAllAccounts() {
        return accounts;
    }

    public int getAccountCount() {
        return accCount;
    }

    public Transaction[] getAllTransactions() {
        return transaction;
    }

    public int getTransactionCount() {
        return txnCount;
    }
}
	

