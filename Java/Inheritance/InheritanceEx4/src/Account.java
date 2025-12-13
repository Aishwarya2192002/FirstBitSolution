class Account {

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
	void Display()
	{
		System.out.println("AccountNumber is:"+this.accountNumber);
		System.out.println("Balance is:"+this.balance);
	}
}//Account class ends here
class SavingAccount extends Account
{
	double interestRate = 4.5;

	SavingAccount() //Default Constructor
	{
		super();
		System.out.println("SavingAccount Default Constructor");
		this.interestRate=4.5;
	}

	SavingAccount(int accountNumber, double balance,double interestRate) //parameterize Constructor
	{
		super(accountNumber, balance);
		System.out.println("SavingAccount parameterize Constructor");
		this.interestRate=interestRate;
	}
	void Display()
	{
		super.Display();
		System.out.println("interestRate is:"+this.interestRate);
	}
}//SavingAccount class ends here
class CurrentAccount extends Account
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
	void Display()
	{
		super.Display();
		System.out.println("overdraftLimit is:"+this.overdraftLimit);
	}
}//CurrentAccount class ends here
class DemoInheritanceAccount 
{
	public static void main(String[] args)
	{
		System.out.println("\n.....Account........");
        Account a1 = new Account();
        a1.Display();
        Account a2 = new Account(2002, 35000.0);
        a2.Display();
        
        System.out.println("\n.....SavingAccount........");
        SavingAccount s1 = new SavingAccount();
        s1.Display();
        SavingAccount s2 = new SavingAccount(3003, 45000.0, 5.0);
        s2.Display();
        
        System.out.println("\n.....CurrentAccount........");
        CurrentAccount c1 = new CurrentAccount();
        c1.Display();
        CurrentAccount c2 = new CurrentAccount(4004, 60000.0, 15000.0);
        c2.Display();
	}
}//DemoInheritanceAccount class ends here
