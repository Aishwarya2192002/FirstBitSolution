class Car
{
    String model;
    String brand;
    String color;
    int price,fuelcapacity;
    Car()//default constructor
    {
        System.out.println("default Constructor called");
        this.model="i20";
        this.brand="Hyundai";
        this.color="Red";
        this.fuelcapacity=45;
    }
    Car(String str1,String str2,String  str3,int c)//parameterize constructor
    {
        System.out.println("parameterize Constructor called");
        this.model=str1;
        this.brand=str2;
        this.color=str3;
        this.fuelcapacity=c;
    }
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
         Car [] arr=new Car[4];
         arr[0]=new Car();
         arr[1]=new Car("i20","Hyundai","Black",67);
         arr[2]=new Car();
         arr[3]=new Car();
         for(int i=0;i<arr.length;i++)
         {
             arr[i].Display();
         }
    }//main ends here
}//TestCar ends here

     


 