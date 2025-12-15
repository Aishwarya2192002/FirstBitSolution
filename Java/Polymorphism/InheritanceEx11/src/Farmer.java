class Farmer {
       int farmerId;
       String farmerName;
       double landArea;
       String city;
       double annualIncome;
       int numberOfEquipment;
       double insuranceAmount;
       
     Farmer() //Default Constructor
   	{
   		super();
   		System.out.println("Farmer Default Constructor");
   		this.farmerId = 101;
   		this.farmerName = "Xyz";
   		this.landArea = 5.5;
   		this.city = "Nashik";
   		this.annualIncome = 450000;
   		this.numberOfEquipment = 6;
   		this.insuranceAmount = 200000;
   	}
	Farmer(int farmerId, String farmerName, double landArea, String city, double annualIncome,
			int numberOfEquipment, double insuranceAmount) //parameterize Constructor
	{
		super();
		System.out.println("Farmer parameterize Constructor");
		this.farmerId = farmerId;
		this.farmerName = farmerName;
		this.landArea = landArea;
		this.city = city;
		this.annualIncome = annualIncome;
		this.numberOfEquipment = numberOfEquipment;
		this.insuranceAmount = insuranceAmount;
	}
	
	int getFarmerId() {
		return farmerId;
	}
	void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}
	String getFarmerName() {
		return farmerName;
	}
	void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}
	double getLandArea() {
		return landArea;
	}
	void setLandArea(double landArea) {
		this.landArea = landArea;
	}
	String getCity() {
		return city;
	}
	void setCity(String city) {
		this.city = city;
	}
	double getAnnualIncome() {
		return annualIncome;
	}
	void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	int getNumberOfEquipment() {
		return numberOfEquipment;
	}
	void setNumberOfEquipment(int numberOfEquipment) {
		this.numberOfEquipment = numberOfEquipment;
	}
	double getInsuranceAmount() {
		return insuranceAmount;
	}
	void setInsuranceAmount(double insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}
	void Display()
    {
    	System.out.println("farmerId is:"+this.farmerId);
    	System.out.println("farmerName is:"+this.farmerName);
    	System.out.println("landArea is:"+this.landArea);
    	System.out.println("city is:"+this.city);
    	System.out.println("annualIncome is:"+this.annualIncome);
    	System.out.println("numberOfEquipment is:"+this.numberOfEquipment);
    	System.out.println("insuranceAmount is:"+this.insuranceAmount);
    }
	void produce()
	{
		System.out.println("Goods produce");
	}
       
}//Farmer class ends here
class DairyFarmer extends Farmer
{
	int numberOfCattles;
	double milkProducedPerDay;
	String dairyLicenseNumber;
	DairyFarmer() //Default Constructor
	{
		super();
		System.out.println("DairyFarmer Default Constructor");
		this.numberOfCattles=20;
		this.milkProducedPerDay=180.5;
		this.dairyLicenseNumber="DL-4521";
	}
	DairyFarmer(int farmerId, String farmerName, double landArea, String city, double annualIncome,
			int numberOfEquipment, double insuranceAmount,int numberOfCattles,double milkProducedPerDay,String dairyLicenseNumber) //parameterize Constructor
	{
		super(farmerId, farmerName, landArea, city, annualIncome, numberOfEquipment, insuranceAmount);
		System.out.println("DairyFarmer parameterize Constructor");
		this.numberOfCattles=numberOfCattles;
		this.milkProducedPerDay=milkProducedPerDay;
		this.dairyLicenseNumber=dairyLicenseNumber;
	}
	void Display()
    {
		super.Display();
    	System.out.println("numberOfCattles is:"+this.numberOfCattles);
    	System.out.println("milkProducedPerDay is:"+this.milkProducedPerDay);
    	System.out.println("dairyLicenseNumber is:"+this.dairyLicenseNumber);
    }
	void produce()
	{
		System.out.println("milk produce");
	}
}//DairyFarmer class ends here
class PoultryFarmer extends Farmer
{
	int numberOfChickens;
	int numberOfHens;
	int eggsProducedPerDay;
	int shedCapacity;
	String poultryFarmName;
	PoultryFarmer() //Default Constructor
	{
		super();
		System.out.println("PoultryFarmer Default Constructor");
		this.numberOfChickens = 500;
		this.numberOfHens= 350;
		this.eggsProducedPerDay = 280;
		this.shedCapacity = 600;
		this.poultryFarmName = "Green Eggs Farm";
	}
	PoultryFarmer(int farmerId, String farmerName, double landArea, String city, double annualIncome,
			int numberOfEquipment, double insuranceAmount,int numberOfChickens,int numberOfHens,int eggsProducedPerDay,int shedCapacity,String poultryFarmName)//parameterize Constructor 
	{
		super(farmerId, farmerName, landArea, city, annualIncome, numberOfEquipment, insuranceAmount);
		System.out.println("PoultryFarmer parameterize Constructor");
		this.numberOfChickens = numberOfChickens;
		this.numberOfHens= numberOfHens;
		this.eggsProducedPerDay = eggsProducedPerDay;
		this.shedCapacity = shedCapacity;
		this.poultryFarmName = poultryFarmName;
	}
	void Display()
    {
		super.Display();
    	System.out.println("numberOfChickens is:"+this.numberOfChickens);
    	System.out.println("numberOfHens is:"+this.numberOfHens);
    	System.out.println("eggsProducedPerDay is:"+this.eggsProducedPerDay);
    	System.out.println("shedCapacity is:"+this.shedCapacity);
    	System.out.println("poultryFarmName is:"+this.poultryFarmName);
    }
	void produce()
	{
		System.out.println("eggs produce");
	}
}//PoultryFarmer class ends here
class OrganicFarmer extends Farmer
{
	String organicCertId;
	String cropType;
	String fertilizerUsed;
	OrganicFarmer()//Default Constructor
	{
		super();
		System.out.println("OrganicFarmer Default Constructor");
		this.organicCertId="ORG-8899";
		this.cropType="Vegetables";
		this.fertilizerUsed="Bio Compost";
	}
	OrganicFarmer(int farmerId, String farmerName, double landArea, String city, double annualIncome,
			int numberOfEquipment, double insuranceAmount,String organicCertId,String cropType,String fertilizerUsed) //parameterize Constructor
	{
		super(farmerId, farmerName, landArea, city, annualIncome, numberOfEquipment, insuranceAmount);
		System.out.println("OrganicFarmer parameterize Constructor");
		this.organicCertId=organicCertId;
		this.cropType=cropType;
		this.fertilizerUsed=fertilizerUsed;
	}
	void Display()
    {
		super.Display();
    	System.out.println("organicCertId is:"+this.organicCertId);
    	System.out.println("cropType is:"+this.cropType);
    	System.out.println("fertilizerUsed is:"+this.fertilizerUsed);
    }
	void produce()
	{
		System.out.println("fertilizer produce");
	}
}//OrganicFarmer class ends here
class DemoInheritanceFarmer
{
	public static void main(String[] args)
	{
		System.out.println("\n.....Farmer........");
		Farmer f1 ;
		f1= new Farmer();
		f1.produce();
		f1.Display();

		System.out.println("\n.....DairyFarmer........");
		f1= new DairyFarmer();
		f1.produce();
		f1.Display();

		System.out.println("\n.....PoultryFarmer........");
		f1= new PoultryFarmer();
		f1.produce();
		f1.Display();

		System.out.println("\n.....OrganicFarmer........");
		f1= new OrganicFarmer();
		f1.produce();
		f1.Display();

		
	}
}//DemoInheritanceFarmer class ends here
