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
        Employee [] arr=new Employee[3];
        arr[0]=new Employee();
        arr[1]=new Employee(1,"priya",20000);
        arr[2]=new Employee();
        for(int i=0;i<arr.length;i++)
        {
            arr[i].Display();
        }
    }
    //main ends here
}
//TestEmployee ends here