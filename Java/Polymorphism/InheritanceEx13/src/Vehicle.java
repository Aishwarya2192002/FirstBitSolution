class Vehicle {

	  String brand;
	  String model;
	  double price;
	  int speed;
	  
	 Vehicle()//Default Constructor
	 {
		    System.out.println("Vehicle Default Constructor");
		    this.brand = "Honda";
			this.model = "City";
			this.price = 1500000;
			this.speed = 180;
	 }
	 Vehicle(String brand, String model, double price, int speed) //parameterize Constructor
	 {
		System.out.println("Vehicle parameterize Constructor");
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.speed = speed;
	}
	String getBrand() {
		return brand;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	String getModel() {
		return model;
	}
	void setModel(String model) {
		this.model = model;
	}
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
	int getSpeed() {
		return speed;
	}
	void setSpeed(int speed) {
		this.speed = speed;
	}
	void Break()
	{
		System.out.println("Break Applied");
	}
	void Display()
	{
		System.out.println("Brand is:"+this.brand);
		System.out.println("Model is:"+this.model);
		System.out.println("Price is:"+this.price);
		System.out.println("Speed is:"+this.speed);
	}
	  
}//Vehicle class ends here
class Car extends Vehicle
{
	String fuelType;
	int noOfDoors;
	
	Car() // Default Constructor
	{
		super();
		System.out.println("Car Default Constructor");
		this.fuelType="Petrol";
		this.noOfDoors=4;
	}
	
	public Car(String brand, String model, double price, int speed,String fuelType,int noOfDoors)//parameterize Constructor
	{
		super(brand, model, price, speed);
		System.out.println("Car parameterize Constructor");
		this.fuelType=fuelType;
		this.noOfDoors=noOfDoors;
	}
	void Break()
	{
		System.out.println("Break Applied");
	}
	void Display()
	{
		super.Display();
		System.out.println("fuelType is:"+this.fuelType);
		System.out.println("noOfDoors is:"+this.noOfDoors);
	}
}//Car class ends here
class Bike extends Vehicle
{
	int engineCC;

	public Bike()//Default Constructor
	{
		super();
		System.out.println("Bike Default Constructor");
		this.engineCC=220;
	}

	
	public Bike(String brand, String model, double price, int speed,int engineCC)//parameterize Constructor
	{
		super(brand, model, price, speed);
		System.out.println("Bike parameterize Constructor");
		this.engineCC=engineCC;
	}
	void Break()
	{
		System.out.println("Break Applied");
	}
	void Display()
	{
		super.Display();
		System.out.println("engineCC is:"+this.engineCC);
	}
}//Bike class ends here
class DemoInheritanceVehicle
{
	public static void main(String[] args) 
	{
		System.out.println("\n....Vehicle Info.....");
		
		Vehicle v2;
		v2=new Vehicle("Toyota","Innova",1200000,160);
		v2.Break();
		v2.Display();
		
		System.out.println("\n....Car Info.....");
		
		v2=new Car("Tata","Nexon",900000,170,"Diesel",4);
		v2.Break();
		v2.Display();
		
		System.out.println("\n....Bike Info.....");
		
		v2=new Bike("Hyundai","Creta",2500000,120,124);
		v2.Break();
		v2.Display();
	}
}//DemoInheritanceVehicle class ends here

