import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

abstract class Account {

	int accountNumber ;
	double balance ;
	
	Account() //Default Constructor
	{
		super();
		System.out.println("Account Default Constructor");
		this.accountNumber = 123456;
		this.balance = 25000.50;
	}
	Account(int accountNumber, double balance) //parameterize Constructor
	{
		super();
		System.out.println("Account parameterize Constructor");
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String toString()
	{
		return "AccountNumber is:"+this.accountNumber+
		"Balance is:"+this.balance;
	}
	void withdraw(double amount)
	{
		if(amount<=balance)
		{
			balance=balance-amount;
			System.out.println("Withdraw successful : " + amount);
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
}//Account class ends here
class SavingAccount extends Account
{
	double interestRate ;
	double minimumBalance;

	SavingAccount() //Default Constructor
	{
		super();
		System.out.println("SavingAccount Default Constructor");
		this.interestRate=4.5;
		this.minimumBalance=10000;
	}

	SavingAccount(int accountNumber, double balance,double interestRate,double minimumBalance) //parameterize Constructor
	{
		super(accountNumber, balance);
		System.out.println("SavingAccount parameterize Constructor");
		this.interestRate=interestRate;
		this.minimumBalance=minimumBalance;
	}
	public String toString()
	{
		super.toString();
		return "interestRate is:"+this.interestRate+
		"minimumBalance is:"+this.minimumBalance;
	}
	void withdraw(double amount)
	{
			if((balance-amount)>=minimumBalance)
			{
				balance=balance-amount;
	            System.out.println("Saving Account Withdraw : " + amount);
			}
			else
			{
	            System.out.println("Cannot withdraw. Minimum balance must be maintained");
			}
	}

}//SavingAccount class ends here
class CurrentAccount extends Account //overdraft limit check
{
	double overdraftLimit ;

	public CurrentAccount() //Default Constructor
	{
		super();
		System.out.println("CurrentAccount Default Constructor");
		this.overdraftLimit=10000.0;
	}

	public CurrentAccount(int accountNumber, double balance,double overdraftLimit)//parameterize Constructor
	{
		super(accountNumber, balance);
		System.out.println("CurrentAccount parameterize Constructor");
		this.overdraftLimit=overdraftLimit;
	}
	public String toString()
	{
		super.toString();
		return "overdraftLimit is:"+this.overdraftLimit;
	}
	void withdraw(double amount)
	{
		if(overdraftLimit>100)
		{
			System.out.println("minimumBalance is:"+this.overdraftLimit);
		}
		
	}
}//CurrentAccount class ends here 
class SalaryAccount extends Account 
{

    LocalDate lastTransactionDate;

    SalaryAccount() 
    {
        super();
        // Example: 3 months old transaction
        this.lastTransactionDate = LocalDate.now().minusMonths(3);
    }

   
    void withdraw(double amount)
    {

        long monthsDiff = ChronoUnit.MONTHS.between(lastTransactionDate, LocalDate.now());

        if (monthsDiff > 2) 
        {   // MAIN CONDITION
            if (amount <= balance) {
                balance = balance - amount;
                lastTransactionDate = LocalDate.now();
                System.out.println("Salary Account Withdraw Successful: " + amount);
            } 
            else
            {
                System.out.println("Insufficient balance");
            }
        } 
        else 
        {
            System.out.println("Withdraw not allowed. Less than or equal to 2 months");
        }
   }
   
}
class DemoInheritanceAccount 
{
	public static void main(String[] args)
	{
		System.out.println("\n.....Account........");
		Account a1;
		
        
        System.out.println("\n.....SavingAccount........");

		a1=new SavingAccount();
		a1.withdraw(7654435);
		System.out.println(a1.toString());
		
        System.out.println("\n.....CurrentAccount........");

		a1=new CurrentAccount();
		a1.withdraw(9765);
		System.out.println(a1.toString());
		
		a1=new SalaryAccount();
		a1.withdraw(87000);
		System.out.println(a1.toString());
	}
}//DemoInheritanceAccount class ends here

