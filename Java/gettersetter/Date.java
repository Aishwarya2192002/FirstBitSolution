class Date
{
     int day,month,year;
     String dow;
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
class Test
{
      public static void main(String[]args)
      {
             Date d1;//reference
             d1=new Date();
             d1.setDay(31);
             d1.setMonth(10);
             d1.setYear(2025);
             d1.setDOW("friday");
             //System.out.println("date:"+d1.day+"/"+d1.month+"/"+d1.year);
             /System.out.println("week:" +d1.dow);
             Date d2=new Date();
             d2.setDay(3);
             d2.setMonth(11);
             d2.setYear(2025);
             d2.setDOW("friday");
             //System.out.println("date:"+d2.day+"/"+d2.month+"/"+d2.year);
            // System.out.println("week:" +d2.dow);
             if(d1.getDay() > d2.getDay())
             {
                  System.out.println("d1 is younger");
             }
             else
             {
                  System.out.println("d2 is younger");
             }
             d1.Display();
             d2.Display();
              
       }//main ends here
}
//Test ends here