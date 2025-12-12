import java.util.Scanner;
class ElectricityBill
{
      static double ratePerUnit;
      String CustomerName;
      int CustomerNumber;
      int unitsConsumed;
      static
      {
           ratePerUnit=4.5;
      }
     ElectricityBill()
     {
          System.out.println("default constructor called");
          this.CustomerName="Priya";
          this.CustomerNumber=123345;
          this.unitsConsumed=10;
          
     }
     ElectricityBill(String Name,int Number,int Consumed)
     {
          System.out.println("parameterize constructor called");
          this.CustomerName=Name;
          this.CustomerNumber=Number;
          this.unitsConsumed=Consumed;
          
     }
     static void changeRate(double Rate)
     {
           ratePerUnit=Rate;
     }
     double calculateBill()
    {
        return unitsConsumed * ratePerUnit;
    }
     void Display()
     {
          System.out.println("\nCustomerName:"+this.CustomerName);
          System.out.println("CustomerNumber:"+this.CustomerNumber);
          System.out.println("unitsConsumed:"+this.unitsConsumed);
          System.out.println("ratePerUnit:"+this.ratePerUnit);
          System.out.println("Total Bill:"+calculateBill());
    }
}//ElectricityBill ends here
class TestElectricityBill
{
      public static void main(String[]args)
       {
            Scanner sc=new Scanner (System.in);
            System.out.println("\n Enter CustomerName:");
            String CustomerName=sc.nextLine();
            System.out.println("Enter CustomerNumber:");
            int CustomerNumber=sc.nextInt();
            System.out.println("Enter unitsConsumed:");
            int unitsConsumed=sc.nextInt();
            
            ElectricityBill e1=new ElectricityBill(CustomerName,CustomerNumber,unitsConsumed);
            e1.Display();
            ElectricityBill e2=new ElectricityBill();
            e2.Display();
            ElectricityBill.changeRate(6.0);
            e1.Display();
            e2.Display();
       }
}//TestElectricityBill ends here
     
     