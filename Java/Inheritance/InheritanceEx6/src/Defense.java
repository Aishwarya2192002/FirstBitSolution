class Defense 
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
    void Display()
    {
    	System.out.println("DefenseName is:"+this.defenseName);
    	System.out.println("HeadName is:"+this.headName);
    	System.out.println("NumberOfTroop is:"+this.numberOfTroops);
    	System.out.println("Budget is:"+this.budget);
    	System.out.println("NumberOfDepartments is:"+this.numberOfDepartments);
    	System.out.println("NumberOfVehicles is:"+this.numberOfVehicles);
    	System.out.println("HeadQuarterLocation is:"+this.headQuarterLocation);
    	System.out.println("CountryName is:"+this.countryName);
    	System.out.println("ManpowerCount is:"+this.manpowerCount);
    	System.out.println("NumberOfMissions is:"+this.numberOfMissions);
    	System.out.println("NumberOfCasualties is:"+this.numberOfCasualties);
    }
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
	void Display()
	{
		super.Display();
		System.out.println("numberOfTanks is:"+this.numberOfTanks);
		System.out.println("numberOfGuns is:"+this.numberOfGuns);
		System.out.println("numberOfBattalions is:"+this.numberOfBattalions);
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
	void Display()
	{
		super.Display();
		System.out.println("numberOfShips is:"+this.numberOfShips);
		System.out.println("numberOfSubmarines is:"+this.numberOfSubmarines);
		System.out.println("numberOfTorpedoes is:"+this.numberOfTorpedoes);
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
	void Display()
	{
		super.Display();
		System.out.println("numberOfMissiles is:"+this.numberOfMissiles);
		System.out.println("numberOfAircraft is:"+this.numberOfAircraft);
		System.out.println("numberOfSquadrons is:"+this.numberOfSquadrons);
	}
	
}//AirForce class ends here
class DemoInheritanceDefense
{
	public static void main(String[] args) 
	{
		System.out.println("\n.....Defense........");
		Defense d1 = new Defense();
		d1.Display();

		Defense d2 = new Defense("Indian Defense", "General XYZ", 1400000 ,6.5,5,50000,"New Delhi","India", 1500000,120,3000);
		d2.Display();


		System.out.println("\n.....Army........");
		Army a1 = new Army();
		a1.Display();

		Army a2 = new Army("Indian Defense", "General XYZ", 1400000 ,6.5,5,50000,"New Delhi","India", 1500000,120,3000,4200, 15000,450 );
		a2.Display();


		System.out.println("\n.....Navy........");
		Navy n1 = new Navy();
		n1.Display();

		Navy n2 = new Navy("Indian Defense", "General XYZ", 1400000 ,6.5,5,50000,"New Delhi","India", 1500000,120,3000,295,24,800);
		n2.Display();


		System.out.println("\n.....AirForce........");
		AirForce af1 = new AirForce();
		af1.Display();

		AirForce af2 = new AirForce("Indian Defense", "General XYZ", 1400000 ,6.5,5,50000,"New Delhi","India", 1500000,120,3000,4200, 15000,450);
		af2.Display();

	}
}//DemoInheritanceDefense class ends here