class Car
{
    String model;
    String brand;
    String color;
    int price,fuelcapacity;
    void setModel(String str1)
     {
        this.model=str1;
     }
     void setBrand(String str2)
     {
        this.brand=str2;
     }
     void setColor(String  str3)
     {
         this.color=str3;
     }
     void setFuelcapacity(int c)
     {
         this.fuelcapacity=c;
     }
     String getModel()
     {
        return this.model;
     }
     String getBrand()
     {
        return this.brand;
     }
     String getColor()
     {
         return this.color;
     }
     int getFuelcapacity()
     {
        return this.fuelcapacity;
     }
     void Display()
     {
          System.out.println("Car Model:"+this.model);
          System.out.println("Car Brand:"+this.brand);
          System.out.println("Car Color:"+this.color);
           System.out.println("Car Fuelcapacity:"+this.fuelcapacity);
      }
}//Car ends here
class TestCar
{
    public static void main(String[]args)
    {
         Car c1=new Car();
         c1.setModel("Mustang");
         c1.setBrand("Ford");
         c1.setColor("black");
         c1.setFuelcapacity(60);
        c1.Display();
    }//main ends here
}//TestCar ends here

     


 