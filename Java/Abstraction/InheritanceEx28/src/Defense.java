abstract class Defense 
{
      String defenseName;
      String headName;
      int numberOfTroops;
      double budget;
      int numberOfDepartments;
      int numberOfVehicles;
      String headQuarterLocation;
      String countryName;
      int manpowerCount;
      int numberOfMissions;
      int numberOfCasualties;
      
    Defense()//Default Constructor
    {
    	super();
  	  System.out.println("Defense Default Constructor");
		this.defenseName = "Indian Defense";
		this.headName = "General XYZ";
		this.numberOfTroops = 1400000;
		this.budget = 6.5;
		this.numberOfDepartments = 5;
		this.numberOfVehicles = 50000;
		this.headQuarterLocation = "New Delhi";
		this.countryName = "India";
		this.manpowerCount = 1500000;
		this.numberOfMissions = 120;
		this.numberOfCasualties = 3000;
    }
      
	Defense(String defenseName, String headName, int numberOfTroops, double budget, int numberOfDepartments,
			int numberOfVehicles, String headQuarterLocation, String countryName, int manpowerCount,
			int numberOfMissions, int numberOfCasualties) //parameterize Constructor
	{
		super();
		System.out.println("Defense parameterize Constructor");
		this.defenseName = defenseName;
		this.headName = headName;
		this.numberOfTroops = numberOfTroops;
		this.budget = budget;
		this.numberOfDepartments = numberOfDepartments;
		this.numberOfVehicles = numberOfVehicles;
		this.headQuarterLocation = headQuarterLocation;
		this.countryName = countryName;
		this.manpowerCount = manpowerCount;
		this.numberOfMissions = numberOfMissions;
		this.numberOfCasualties = numberOfCasualties;
	}
	String getDefenseName() {
		return defenseName;
	}
	void setDefenseName(String defenseName) {
		this.defenseName = defenseName;
	}
	String getHeadName() {
		return headName;
	}
	void setHeadName(String headName) {
		this.headName = headName;
	}
	int getNumberOfTroops() {
		return numberOfTroops;
	}
	void setNumberOfTroops(int numberOfTroops) {
		this.numberOfTroops = numberOfTroops;
	}
	double getBudget() {
		return budget;
	}
	void setBudget(double budget) {
		this.budget = budget;
	}
	int getNumberOfDepartments() {
		return numberOfDepartments;
	}
	void setNumberOfDepartments(int numberOfDepartments) {
		this.numberOfDepartments = numberOfDepartments;
	}
	int getNumberOfVehicles() {
		return numberOfVehicles;
	}
	void setNumberOfVehicles(int numberOfVehicles) {
		this.numberOfVehicles = numberOfVehicles;
	}
	String getHeadQuarterLocation() {
		return headQuarterLocation;
	}
	void setHeadQuarterLocation(String headQuarterLocation) {
		this.headQuarterLocation = headQuarterLocation;
	}
	String getCountryName() {
		return countryName;
	}
	void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	int getManpowerCount() {
		return manpowerCount;
	}
	void setManpowerCount(int manpowerCount) {
		this.manpowerCount = manpowerCount;
	}
	int getNumberOfMissions() {
		return numberOfMissions;
	}
	void setNumberOfMissions(int numberOfMissions) {
		this.numberOfMissions = numberOfMissions;
	}
	int getNumberOfCasualties() {
		return numberOfCasualties;
	}
	void setNumberOfCasualties(int numberOfCasualties) {
		this.numberOfCasualties = numberOfCasualties;
	}
    public String toString()
    {
    	return "DefenseName is:"+this.defenseName+
    	"HeadName is:"+this.headName+
    	"NumberOfTroop is:"+this.numberOfTroops+
    	"Budget is:"+this.budget+
    	"NumberOfDepartments is:"+this.numberOfDepartments+
    	"NumberOfVehicles is:"+this.numberOfVehicles+
    	"HeadQuarterLocation is:"+this.headQuarterLocation+
    	"CountryName is:"+this.countryName+
    	"ManpowerCount is:"+this.manpowerCount+
    	"NumberOfMissions is:"+this.numberOfMissions+
    	"NumberOfCasualties is:"+this.numberOfCasualties;
    }
    abstract void attack();
    
}//Defense class ends here
class Army extends Defense
{
	int numberOfTanks;
	int numberOfGuns;
	int numberOfBattalions;
	Army() //Default Constructor
	{
		super();
		System.out.println("Army Default Constructor");
		this.numberOfTanks=4200;
		this.numberOfGuns=15000;
		this.numberOfBattalions=450;
	}
	Army(String defenseName, String headName, int numberOfTroops, double budget, int numberOfDepartments,
			int numberOfVehicles, String headQuarterLocation, String countryName, int manpowerCount,
			int numberOfMissions, int numberOfCasualties,int numberOfTanks,int numberOfGuns,int numberOfBattalions)//parameterize Constructor
	{
		super(defenseName, headName, numberOfTroops, budget, numberOfDepartments, numberOfVehicles, headQuarterLocation,
				countryName, manpowerCount, numberOfMissions, numberOfCasualties);
		System.out.println("Army parameterize Constructor");
		this.numberOfTanks=numberOfTanks;
		this.numberOfGuns=numberOfGuns;
		this.numberOfBattalions=numberOfBattalions;
	}
    public String toString()
	{
		super.toString();
		return "numberOfTanks is:"+this.numberOfTanks+
		"numberOfGuns is:"+this.numberOfGuns+
		"numberOfBattalions is:"+this.numberOfBattalions;
	}
	void attack()
    {
    	System.out.println("Attack Guns");
    }
	
}//Army class ends here
class Navy extends Defense
{
	int numberOfShips;
	int numberOfSubmarines;
	int numberOfTorpedoes;
	Navy() //Default Constructor
	{
		super();
		System.out.println("Navy Default Constructor");
		this.numberOfShips=295;
		this.numberOfSubmarines=24;
		this.numberOfTorpedoes=800;
	}
	Navy(String defenseName, String headName, int numberOfTroops, double budget, int numberOfDepartments,
			int numberOfVehicles, String headQuarterLocation, String countryName, int manpowerCount,
			int numberOfMissions, int numberOfCasualties,int numberOfShips,int numberOfSubmarines,int numberOfTorpedoes)//parameterize Constructor 
	{
		super(defenseName, headName, numberOfTroops, budget, numberOfDepartments, numberOfVehicles, headQuarterLocation,
				countryName, manpowerCount, numberOfMissions, numberOfCasualties);
		System.out.println("Navy parameterize Constructor");
		this.numberOfShips=numberOfShips;
		this.numberOfSubmarines=numberOfSubmarines;
		this.numberOfTorpedoes=numberOfTorpedoes;
	}
    public String toString()
	{
		super.toString();
		return "numberOfShips is:"+this.numberOfShips+
		"numberOfSubmarines is:"+this.numberOfSubmarines+
		"numberOfTorpedoes is:"+this.numberOfTorpedoes;
	}
	void attack()
    {
    	System.out.println("Attack Submarines");
    }
}//Navy class ends here
class AirForce extends Defense
{
	int numberOfMissiles;
	int numberOfAircraft;
	int numberOfSquadrons;
	AirForce()//Default Constructor
	{
		super();
		System.out.println("AirForce Default Constructor");
		this.numberOfMissiles=1200;
		this.numberOfAircraft=2100;
		this.numberOfSquadrons=42;
	}
	AirForce(String defenseName, String headName, int numberOfTroops, double budget, int numberOfDepartments,
			int numberOfVehicles, String headQuarterLocation, String countryName, int manpowerCount,
			int numberOfMissions, int numberOfCasualties,int numberOfMissiles,int numberOfAircraft,int numberOfSquadrons) //parameterize Constructor
	{
		super(defenseName, headName, numberOfTroops, budget, numberOfDepartments, numberOfVehicles, headQuarterLocation,
				countryName, manpowerCount, numberOfMissions, numberOfCasualties);
		System.out.println("AirForce parameterize Constructor");
		this.numberOfMissiles=numberOfMissiles;
		this.numberOfAircraft=numberOfAircraft;
		this.numberOfSquadrons=numberOfSquadrons;
	}
    public String toString()
	{
		super.toString();
		return "numberOfMissiles is:"+this.numberOfMissiles+
		"numberOfAircraft is:"+this.numberOfAircraft+
		"numberOfSquadrons is:"+this.numberOfSquadrons;
	}
	void attack()
    {
    	System.out.println("Attack Missiles");
    }
}//AirForce class ends here
class DemoInheritanceDefense
{
	public static void main(String[] args) 
	{
		System.out.println("\n.....Defense........");
		Defense d1 ;
		


		System.out.println("\n.....Army........");
		d1= new Army();
		d1.attack();
		System.out.println(d1.toString());

		

		System.out.println("\n.....Navy........");
		d1= new Navy();
		d1.attack();
		System.out.println(d1.toString());

		

		System.out.println("\n.....AirForce........");
		d1= new AirForce();
		d1.attack();
		System.out.println(d1.toString());

		
	}
}//DemoInheritanceDefense class ends here


