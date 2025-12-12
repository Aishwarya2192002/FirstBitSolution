class Admin
{
    int id;
    String name;
    double salary;
    double allowance;
   Admin()//default constructor
   {
      System.out.println("default Constructor called");
      this.id=2;
      this.name="Payal";
      this.salary=20000;
      this.allowance=5000;
   }
    Admin(int d,String str,double s,double a)//parameterize constructor
   {
      System.out.println("parameterize Constructor called");
      this.id=d;
      this.name=str;
      this.salary=s;
      this.allowance=a;
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
          Admin [] arr=new Admin[4];
          arr[0]=new Admin();
          arr[1]=new Admin(1,"siya",6000,5000);
          arr[2]=new Admin();
          arr[3]=new Admin();
          for(int i=0;i<arr.length;i++)
          {
              arr[i].Display();
          }
     }
//main ends here
}
//TestAdmin ends here