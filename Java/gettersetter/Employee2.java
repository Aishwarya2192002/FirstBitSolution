class Employee
{
   int id;
   String name;
   double salary;
   void setId(int d)
   {
       this.id=d;
   }
   void setName(String str)
   {
        this.name=str;
   }
   void setSalary(double s)
   {
        this.salary=s;
   }
   int getId()
   {
       return this.id;
   }
   String getName()
   {
        return this.name;
   }
   double getSalary()
   {
        return this.salary;
   }
   void Display()
   {
       System.out.println("Employee Id: " + this.id);
       System.out.println("Employee Name: " + this.name);
       System.out.println("Employee Salary: " + this.salary);
   }
}
//Employee ends here
class TestEmployee
{
   public static void main(String[]args)
   {
        Employee e;//reference
        e=new Employee();//object
        e.setId(1);
        e.setName("Aishwarya");
        e.setSalary(15000);
        e.Display();
    }
    //main ends here
}
//TestEmployee ends here