class SalesManager
{
   int id,target;
   String name;
   double salary,incentive;
   SalesManager()//default constructor
   {
       System.out.println("default Constructor called");
       this.id=2;
       this.name="Mayuri";
       this.salary=45000;
       this.target=50000;
       this.incentive=10000;
    } 
    SalesManager(int d,String str,double s,int t,double i)//parameterize constructor
    {
       System.out.println("parameterize Constructor called");
       this.id=d;
       this.name=str;
       this.salary=s;
       this.target=t;
       this.incentive=i;
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
          SalesManager s1=new SalesManager();
          SalesManager s2=new SalesManager();
          SalesManager s3=new SalesManager(3,"Priya",23000,5000,1000);
          s1.setId(1);
          s1.setName("Aishwarya");
          s1.setSalary(15000);
          s1.setTarget(50000);
          s1.setIncentive(10);
          s1.Display();
          s2.Display();
          s3.Display();
     }
     //main ends here
}
//TestSalesManager ends here