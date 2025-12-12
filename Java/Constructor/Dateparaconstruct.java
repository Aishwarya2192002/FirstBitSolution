class Date
{
     int day,month,year;
     String dow;
     Date()//default constructor
     {
        System.out.println("Constructor called");
        this.day=21;
        this.month=9;
        this.year=2002;
        this.dow="saturday";
     }
     Date(int d,int m,int y,String str)//parameterize constructor
     {
        System.out.println("parameterize Constructor called");
        this.day=d;
        this.month=m;
        this.year=y;
        this.dow=str;
     }
     void setDay(int d)
     {
         this.day=d;
     }
     void setMonth(int m)
     {
         this.month=m;
     }
     void setYear(int y)
     {
         this.year=y;
     }
     void setDOW(String str)
     {
        this.dow=str;
     }
     int getDay()
     {
          return this.day;
     }
     int getMonth()
     {
          return this.month;
     }
     int getYear()
     {
          return this.year;
     }
     String getDOW()
     {
          return this.dow;
     }
     void Display()
     {
         System.out.println("Day is:"+this.day);
         System.out.println("Month is:"+this.month);
         System.out.println("Year is:"+this.year);
         System.out.println("DOW is:"+this.dow);
     }
}
//Date ends here
class TestDate
{
      public static void main(String[]args)
      {
             Date d1;//reference
             d1=new Date();
             Date d2=new Date(4,9,2025,"monday");
             Date d3=new Date();
             d1.setDay(31);
             d1.setMonth(10);
             d1.setYear(2025);
             d1.setDOW("friday");
             
             d1.Display();
             d2.Display();
             d3.Display();
              
       }//main ends here
}
//Test ends here