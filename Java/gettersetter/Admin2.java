class Admin
{
    int id;
    String name;
    double salary;
    double allowance;
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
   void setAllowance(double a)
   {
        this.allowance=a;
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
   double getAllowance()
   {
       return this.allowance;
   }
   void Display()
   {
          System.out.println("Admin ID:"+this.id);
          System.out.println("Admin name:"+this.name);
          System.out.println("Admin salary:"+this.salary);
          System.out.println("Admin allowance:"+this.allowance);
   }
}
//Admin ends here
class TestAdmin
{
     public static void main(String[]args)
     {
          Admin a=new Admin();
          Admin b=new Admin();
          a.setId(1);
          a.setName("Aishwarya");
          a.setSalary(15000);
          a.setAllowance(5000);
          b.setId(2);
          b.setName("Riya");
          b.setSalary(15000);
          b.setAllowance(5000);
          a.Display();
          b.Display();
     }
//main ends here
}
//TestAdmin ends here