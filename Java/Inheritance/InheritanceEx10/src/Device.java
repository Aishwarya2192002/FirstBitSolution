class Device 
{
      int deviceId;
      String brand;
	Device() //Default Constructor
	{
		super();
		System.out.println("Device Default Constructor");
		this.deviceId = 101;
		this.brand = "Samsung";
	}
	Device(int deviceId, String brand) //Parameterize Constructor
	{
		super();
		System.out.println("Device parameterize Constructor");
		this.deviceId = deviceId;
		this.brand = brand;
	} 
	
	int getDeviceId() {
		return deviceId;
	}
	void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	String getBrand() {
		return brand;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	void Display()
    {
    	System.out.println("deviceId is:"+this.deviceId);
    	System.out.println("brand is:"+this.brand);
    }
}//Device class ends here
class Mobile extends Device
{
	String simType;

	Mobile()//Default Constructor
	{
		super();
		System.out.println("Mobile Default Constructor");
		this.simType="5G";
	}

	Mobile(int deviceId, String brand,String simType) //parameterize Constructor
	{
		super(deviceId, brand);
		System.out.println("Mobile parameterize Constructor");
		this.simType=simType;
	}
	void Display()
    {
		super.Display();
    	System.out.println("simType is:"+this.simType);
    }
}//Mobile class ends here
class Laptop extends Device
{
	int ram;

	Laptop() //Default 
	{
		super();
		System.out.println("Laptop Default Constructor");
		this.ram=16;
	}

	Laptop(int deviceId, String brand,int ram) //parameterize Constructor
	{
		super(deviceId, brand);
		System.out.println("Laptop parameterize Constructor");
		this.ram=ram;
	}
	void Display()
    {
		super.Display();
    	System.out.println("ram is:"+this.ram);
    }
}//Laptop class ends here
class DemoInheritanceDevice
{
	public static void main(String[] args) 
	{
		System.out.println("\n.....Device........");
		Device d1 = new Device();
		d1.Display();

		Device d2 = new Device(101,"Samsung");
		d2.Display();
		
		System.out.println("\n.....Mobile........");
		Mobile m1 = new Mobile();
		m1.Display();

		Mobile m2 = new Mobile(101,"Samsung","5G");
		m2.Display();
		
		System.out.println("\n.....Laptop........");
		Laptop l1 = new Laptop();
		l1.Display();

		Laptop l2 = new Laptop(101,"Samsung",16);
		l2.Display();
	}
}
//DemoInheritanceDevice class ends here