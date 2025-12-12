import java.util.Scanner;
class LibraryUser
{
      String name;
      int daysLate;
      static int finePerDay;
      LibraryUser()
      {
          System.out.println("default constructor called");
          this.name="Not assign";
          this.daysLate=4;
      }
      LibraryUser(String name,int daysLate)
      {
          System.out.println("parameterize constructor called");
          this.name=name;
          this.daysLate=daysLate;
      }
      static
      {
             finePerDay=20;
      }
      int calculateFine()
      {
          return daysLate * finePerDay;
      }
      void Display() 
      {
          System.out.println("\nName is:"+this.name);
          System.out.println("daysLate is:"+this.daysLate);
          System.out.println("finePerDay is:"+this.finePerDay);
          System.out.println("calculateFine is:"+calculateFine());
      }
}//LibraryUser ends here
class TestLibraryUser
{
       public static void main(String[]args)
       {
            Scanner sc=new Scanner (System.in);
            System.out.println("\nEnter Name:");
            String Name=sc.nextLine();
            System.out.println("Enter daysLate:");
            int daysLate=sc.nextInt();
          
            LibraryUser l1=new LibraryUser(Name,daysLate);
            LibraryUser l2=new LibraryUser("not",4);

            l1.Display();
            l2.Display();
     }
}//TestLibraryUser ends here





