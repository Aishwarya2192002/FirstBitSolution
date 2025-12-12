import java.util.Scanner;
class BankAccount
{
     int accountNumber;
     String accHolderName;
     double currentBalance;
    static double interestRate;
      static
      {
           interestRate=7.5;
      }
     BankAccount()
     {
          System.out.println("default Constructor called");
          this.accountNumber=123456;
          this.accHolderName="Aishwarya";
          this.currentBalance=1000;
          //this.interestRate=1;
     }
     BankAccount(int a,String str,double c)
     {
         System.out.println("default Constructor called");
         this.accountNumber=a;
         this.accHolderName=str;
         this.currentBalance=c;
         //this.interestRate=i;
     }
         
     void setaccountNumber(int a)
     {
         this.accountNumber=a;
     }
     void setaccHolderName(String str)
     {
         this.accHolderName=str;
     }
     void setcurrentBalance(double c)
     {
         this.currentBalance=c;
     }
     static void setinterestRate(double i)
     {
         interestRate=i;
     }
     int getaccountNumber()
     {
         return this.accountNumber;
     }
     String getaccHolderName()
     {
         return this.accHolderName;
     }
     double getcurrentBalance()
     {
         return this.currentBalance;
     }
     double getinterestRate()
     {
         return this.interestRate;
     }
     void Display()
     {
          System.out.println("\naccountNumber:"+this.accountNumber);
          System.out.println("accHolderName:"+this.accHolderName);
          System.out.println("currentBalance:"+this.currentBalance);
          System.out.println("interestRate:"+this.interestRate);
    }
}//BankAccount ends here
class TestBankAccount
{
        public static void main(String[]args)
       {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter accountNumber");
           int accountNumber=sc.nextInt();
           sc.nextLine();
           System.out.println("Enter accHolderName");
           String accHolderName =sc.nextLine();
           System.out.println("Enter currentBalance");
           double currentBalance=sc.nextDouble();
           //System.out.println("Enter interestRate:");
           //double c=sc.nextDouble();
           BankAccount b1=new BankAccount(accountNumber,accHolderName,currentBalance);
           BankAccount b2=new BankAccount();
           BankAccount b3=new BankAccount(accountNumber,accHolderName,currentBalance);
           b1.Display();
           b2.Display();
           b3.Display();
           BankAccount.setinterestRate(4.5);
           b1.Display();
           b2.Display();
           b3.Display();
          b1.setinterestRate(3.5);
          b1.Display();
      }
}//TestBankAccount ends here