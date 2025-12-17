abstract class Farmer {
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
	public String toString()
    {
    	return "farmerId is:"+this.farmerId+
    	"farmerName is:"+this.farmerName+
    	"landArea is:"+this.landArea+
    	"city is:"+this.city+
    	"annualIncome is:"+this.annualIncome+
    	"numberOfEquipment is:"+this.numberOfEquipment+
    	"insuranceAmount is:"+this.insuranceAmount;
    }
	abstract void produce();
	
       
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
	public String toString()
    {
		super.toString();
    	return "numberOfCattles is:"+this.numberOfCattles+
         "milkProducedPerDay is:"+this.milkProducedPerDay+
    	"dairyLicenseNumber is:"+this.dairyLicenseNumber;
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
	public String toString()
    {
		super.toString();
    	return "numberOfChickens is:"+this.numberOfChickens+
    	"numberOfHens is:"+this.numberOfHens+
    	"eggsProducedPerDay is:"+this.eggsProducedPerDay+
    	"shedCapacity is:"+this.shedCapacity+
    	"poultryFarmName is:"+this.poultryFarmName;
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
	public String toString()
    {
		super.toString();
    	return "organicCertId is:"+this.organicCertId+
    	"cropType is:"+this.cropType+
    	"fertilizerUsed is:"+this.fertilizerUsed;
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
		

		System.out.println("\n.....DairyFarmer........");
		f1= new DairyFarmer();
		f1.produce();
		System.out.println(f1.toString());

		System.out.println("\n.....PoultryFarmer........");
		f1= new PoultryFarmer();
		f1.produce();
		System.out.println(f1.toString());

		System.out.println("\n.....OrganicFarmer........");
		f1= new OrganicFarmer();
		f1.produce();
		System.out.println(f1.toString());

		
	}
}//DemoInheritanceFarmer class ends here

