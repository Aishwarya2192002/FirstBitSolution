abstract class Device 
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
	public String toString()
    {
    	return "deviceId is:"+this.deviceId+
    	"brand is:"+this.brand;
    }
	abstract String getDeviceCategory();
	

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
	public String toString()
    {
		super.toString();
    	return "simType is:"+this.simType;
    }
	String getDeviceCategory()
	{
	    return "Mobile Device";
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
	public String toString()
    {
		super.toString();
    	return "ram is:"+this.ram;
    }
	String getDeviceCategory()
	{
	    return "Laptop Device";
	}

}//Laptop class ends here
class DemoInheritanceDevice
{
	public static void main(String[] args) 
	{
		System.out.println("\n.....Device........");
		Device d1 ;
		
		
		System.out.println("\n.....Mobile........");
		d1= new Mobile();
		System.out.println(d1.getDeviceCategory());
		System.out.println(d1.toString());

		
		
		System.out.println("\n.....Laptop........");
		d1= new Laptop();
		System.out.println(d1.getDeviceCategory());
		System.out.println(d1.toString());

		
	}
}
//DemoInheritanceDevice class ends here

