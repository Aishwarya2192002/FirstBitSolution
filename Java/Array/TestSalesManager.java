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
         SalesManager []arr=new SalesManager[5];
          arr[0]=new SalesManager();
          arr[1]=new SalesManager(1,"priya",20000,5000,888);
          arr[2]=new SalesManager();
          arr[3]=new SalesManager();
          arr[4]=new SalesManager();
          for(int i=0;i<arr.length;i++)
          {
              arr[i].Display();
          }
     }
     //main ends here
}
//TestSalesManager ends here