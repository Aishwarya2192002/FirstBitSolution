import java.util.Scanner;
class Employee
{
     String name;
     double basicSalary;
     static double companyBonusRate;
     static
     {
          companyBonusRate=2.5;
     }
     Employee()
     {
        System.out.println("default constructor called");
        this.name="Riya";
        this.basicSalary=20000;
     }
     Employee(String name,double basicSalary)
     {
        System.out.println("parameterize constructor called");
        this.name=name;
        this.basicSalary=basicSalary;
     }
     static void changebonusrate(double rate)
     {
          companyBonusRate=rate;
     }
     double calculateTotalSalary()
     {
          return basicSalary + (basicSalary * companyBonusRate / 100);
     }
     void Display()
     {
          System.out.println("\nEmployee Name:"+this.name);
          System.out.println("Employee basicSalary:"+this.basicSalary);
          System.out.println("companyBonusRate:"+this.companyBonusRate);
          System.out.println("Total Salary:"+calculateTotalSalary());
     }
}//Employee Ends here
class TestEmployee
{
      public static void main(String[]args)
       {
            Scanner sc=new Scanner (System.in);
            System.out.println("\nEnter Employee Name:");
            String EmployeeName=sc.nextLine();
            System.out.println("Enter Employee basicSalary:");
            double basicSalary=sc.nextDouble();

            Employee e1=new Employee(EmployeeName,basicSalary);
            Employee e2=new Employee();
            e1.Display();
            e2.Display();

            Employee.changebonusrate(4.0);
            e1.Display();
            e2.Display();
      }
}//TestEmployee Ends here