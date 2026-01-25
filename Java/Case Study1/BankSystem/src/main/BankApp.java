package main;

import java.util.Scanner;

import controller.BankController;
import model.Account;
import model.BankModel;
import model.CurrentAccount;
import model.LoanAccount;
import model.SalaryAccount;
import model.SavingsAccount;

public class BankApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankModel model=new BankModel();
        BankController controller=new BankController(model);
        while(true)
        {
        	System.out.println("\n----------Bank Menu-----------");
        	System.out.println("1.Create Account");
        	System.out.println("2.Deposit");
        	System.out.println("3.Withdraw");
        	System.out.println("4.Transfer");
        	System.out.println("5.Apply Monthly Interest");
        	System.out.println("6.End Of Day Report");
        	System.out.println("7.List Accounts");
        	System.out.println("8.Show Account Status");
        	System.out.println("9.Show Account Transaction");
        	System.out.println("10.Show All Bank Transaction");
        	System.out.println("11.Calculate Loan EMI");
        	System.out.println("12.Freeze/Unfreeze Account");
        	System.out.println("13.Close Account");
        	System.out.println("14.Exit");
        	
        	System.out.println("Enter choice");
        	int choice=sc.nextInt();
        	
        	switch(choice)
        	{
        	case 1:
        	{
        		System.out.println("Select Account Type:");
        		System.out.println("1.Saving");
        		System.out.println("2.Salary");
        		System.out.println("3.Current");
        		System.out.println("4.Loan");
        		
        		int type =sc.nextInt();
        		System.out.println("Enter Account Id:");
        		int id=sc.nextInt();
        		System.out.println("Enter Name:");
        		sc.nextLine();
        		String name=sc.nextLine();
        		System.out.println("Enter Intial Amount:");
        		double bal=sc.nextDouble();
        		
        		Account acc=null;
        		
        		if(type==1)
        		{
        			acc=new SavingsAccount(id, name, bal);
        		}
        		else if(type==2)
        		{
        			acc=new SalaryAccount(id, name, bal);
        		}
        		else if(type==3)
        		{
        			System.out.println("Enter Overdraft Limit:");
        			double limit=sc.nextDouble();
        			acc=new CurrentAccount(id, name, bal,limit);
        		}
        		else if(type==4)
        		{
        			acc=new LoanAccount(id, name, bal);
        			
        		}
        		controller.createAccount(acc);
                break;
        	}
        	case 2:
        	{
        		System.out.println("Enter Account Id:");
        		int id=sc.nextInt();
        		System.out.println("Enter Amount:");
        		double amt=sc.nextDouble();
        		controller.deposite(id,amt);
        		break;
        	}
        	case 3:
        	{
        		System.out.println("Enter Account Id:");
        		int id=sc.nextInt();
        		System.out.println("Enter Amount:");
        		double amt=sc.nextDouble();
        		controller.withdraw(id,amt);
        		break;
        	} 
        	case 4:
        	{
        		System.out.println("From Account Id:");
        		int from=sc.nextInt();
        		System.out.println("To Account Id:");
        		int to=sc.nextInt();
        		System.out.println("Amount:");
        		double amt=sc.nextDouble();
        		controller.transfer(from,to,amt);
        		break;
        	} 
        	case 5:
                controller.applyMonthlyInterest();
                break;

            case 6:
                controller.endOfDayReport();
                break;

            case 7:
                controller.listAccounts();
                break;
            case 8: {
                System.out.print("Enter Account Id: ");
                int id = sc.nextInt();
                controller.showAccountStatus(id);
                break;
            }

            case 9: {
                System.out.print("Enter Account Id: ");
                int id = sc.nextInt();
                controller.showAccountTransactions(id);
                break;
            }

            case 10:
                controller.showAllTransactions();
                break;

            case 11: {
                System.out.print("Enter Loan Account Id: ");
                int id = sc.nextInt();
                System.out.print("Enter Months: ");
                int months = sc.nextInt();
                controller.calculateLoanEMI(id, months);
                break;
            }

            case 12: {
                System.out.print("Enter Account Id: ");
                int id = sc.nextInt();
                System.out.println("1. Freeze");
                System.out.println("2. Unfreeze");
                int ch = sc.nextInt();

                if (ch == 1)
                    controller.freezeAccount(id);
                else
                    controller.unfreezeAccount(id);
                break;
            }

            case 13: {
                System.out.print("Enter Account Id: ");
                int id = sc.nextInt();
                controller.closeAccount(id);
                break;
            }

            case 14:
                System.out.println("Thank you for using  Bank");
                System.exit(0);

            default:
                System.out.println("Invalid Choice");
        	}
        }
    }
}
