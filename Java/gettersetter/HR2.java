class HR
{
   int id;
   String name;
   double salary;
   double commission;
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
          HR h=new HR();
          h.setId(1);
          h.setName("Aishwarya");
          h.setSalary(20000);
          h.setCommission(5000);
          h.Display();
     }
     //main ends here
}
//TestHR ends here