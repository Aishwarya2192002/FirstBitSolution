class SalesManager
{
   int id,target;
   String name;
   double salary,incentive;
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
   void setTarget(int t)
   {
       this.target=t;
   }
   void setIncentive(double i)
   {
       this.incentive=i;
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
   int getTarget()
   {
       return this.target;
   }
   double getIncentive()
   {
       return this.incentive;
   }
   void Display()
   {
          System.out.println("SalesManager ID:"+this.id);
          System.out.println("SalesManager name:"+this.name);
          System.out.println("SalesManager salary:"+this.salary);
          System.out.println("SalesManager Target:"+this.target);
          System.out.println("SalesManager Incentive:"+this.incentive); 
   }
}
// SalesManager ends here
class TestSalesManager
{
     public static void main(String[]args)
     {
          SalesManager s=new SalesManager();
          s.setId(1);
          s.setName("Aishwarya");
          s.setSalary(15000);
          s.setTarget(50000);
          s.setIncentive(10);
          s.Display();
     }
     //main ends here
}
//TestSalesManager ends here