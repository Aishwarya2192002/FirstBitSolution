class Date
{
     int day,month,year;
     String dow;
     Date()//default constructor
     {
        System.out.println("default Constructor called");
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
             Date [] arr=new Date[3];
             arr[0]=new Date();
             arr[1]=new Date(7,11,2025,"Friday");
             arr[2]=new Date();
             for (int i=0;i<arr.length;i++)
             {
                 arr[i].Display();
             }
              
       }//main ends here
}
//TestDate ends here