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
          HR []arr=new HR[4];
          arr[0]=new HR();
          arr[1]=new HR(1,"priya",20000,5000);
          arr[2]=new HR();
          arr[3]=new HR();
          for(int i=0;i<arr.length;i++)
          {
              arr[i].Display();
          }
     }
     //main ends here
}
//TestHR ends here