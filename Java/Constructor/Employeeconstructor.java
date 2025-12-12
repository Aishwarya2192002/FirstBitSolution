class Employee
{
   int id;
   String name;
   double salary;
  Employee()//default constructor
    {
       System.out.println("default Constructor called");
       this.id=2;
       this.name="Mayuri";
       this.salary=45000;
       
     } 
     Employee(int d,String str,double s)//parameterize constructor
    {
       System.out.println("parameterize Constructor called");
       this.id=d;
       this.name=str;
       this.salary=s;
     
     } 
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
        Employee e1;//reference
        e1=new Employee();//object
        Employee e2=new Employee();
        Employee e3=new Employee(3,"Riya",6000);
        e1.setId(1);
        e1.setName("Aishwarya");
        e1.setSalary(15000);
        e1.Display();
         e2.Display();
          e3.Display();

    }
    //main ends here
}
//TestEmployee ends here