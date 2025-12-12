class HR
{
   int id;
   String name;
   double salary;
   double commission;
     HR()//default constructor
    {
        System.out.println("default Constructor called");
        this.id=2;
        this.name="Priya";
        this.salary=45000;
        this.commission=10000;
    }
     HR(int d,String str,double s,double c)//parameterize constructor
    {
        System.out.println("parameterize Constructor called");
        this.id=d;
        this.name=str;
        this.salary=s;
        this.commission=c;
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
   void setCommission(double c)
   {
        this.commission=c;
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
   double getCommission()
   {
        return this.commission;
   }
   void Display()
   {
          System.out.println("HR ID:"+this.id);
          System.out.println("HR name:"+this.name);
          System.out.println("HR salary:"+this.salary);
          System.out.println("HR commission:"+this.commission);
   }
}
//HR ends here
class TestHR
{
     public static void main(String[]args)
     {
          HR h1=new HR();
          HR h2=new HR();
          HR h3=new HR(3,"Riya",50000,10000);
          h1.setId(1);
          h1.setName("Aishwarya");
          h1.setSalary(20000);
          h1.setCommission(5000);
          h1.Display();
          h2.Display();
          h3.Display();
     }
     //main ends here
}
//TestHR ends here