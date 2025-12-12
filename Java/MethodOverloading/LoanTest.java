class Student
{
     int rollno;
     String name;
     double percentage;
     Student(int r,String n,double p)
     {
         this.rollno=r;
         this.name=n;
         this.percentage=p;
     }
}
class Employee
{
     int id;
     String name;
     double annualSalary;
     Employee(int i,String n,double a)
     {
        this.id=i;
        this.name=n;
        this.annualSalary=a;
     }
}
class Bank
{
    void approveLoans(Student s)
    {
        System.out.println("\nLoan Approval for Student: " + s.name);
        if(s.percentage > 80)
        {
            System.out.println("Approved Loan: 2 Lakh");
        }
        else if(s.percentage >= 60 && s.percentage <= 80)
        {
             System.out.println("Approved Loan: 1 Lakh");
        }
        else if (s.percentage >= 40 && s.percentage < 60)
        {
             System.out.println("Approved Loan: 50K");
        }
        else
        {
             System.out.println("No Loan Approved");
        }
     }
     void approveLoans(Employee e)
     {
         System.out.println("\nLoan Approval for Employee: " + e.name);
         if(e.annualSalary > 12)
         {
             System.out.println("Approved Loan: 7 Lakh");
         }
         else if (e.annualSalary >= 10 && e.annualSalary <= 12) 
         {
             System.out.println("Approved Loan: 6 Lakh");
         }
         else if (e.annualSalary >= 6 && e.annualSalary < 10) 
         {
             System.out.println("Approved Loan: 5 Lakh");
         }
         else if (e.annualSalary >= 4 && e.annualSalary < 6) 
         {
             System.out.println("Approved Loan: 4 Lakh");
         }
         else 
         {
            System.out.println("No Loan Approved");
         }
     }
}
class LoanTest
{
      public static void main(String[] args)
      {
           Student s1 = new Student(1, "Aishwarya", 75);
           Employee e1 = new Employee(101, "Priya", 11);
           Bank bank = new Bank();
           bank.approveLoans(s1);   
           bank.approveLoans(e1);
       }
}