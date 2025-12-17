abstract class Employee {

	   int id;
	   String name;
	   double salary;
	   
	   Employee() {  //Default Constructor
			System.out.println("Employee Default Constructor");
			this.id = 1;
			this.name ="Priya";
			this.salary = 20000;
	   }
	   
	Employee(int id, String name, double salary) { //parameterize Constructor
		super();
		System.out.println("Employee parameterize Constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	abstract double Calsalary();
	
	public String toString()
	{
	    return "Id is: " + id + ", Name is: " + name + ", Salary is: " + salary;

	}
	
	   
}//Employee class ends here
class HR extends Employee
{
	double commission;

    HR()//Default Constructor
    {
    	super();
    	System.out.println("HR Default Constructor");
    	this.commission=4000;
    }
	HR(int id, String name, double salary,double commission) { //parameterize Constructor
		super(id, name, salary);
		System.out.println("HR parameterize Constructor");
		this.commission = commission;
	}
	double Calsalary()
	{
		return salary+commission;
	}
	
	public String toString()
	{
	    return super.toString() + ", Commission is: " + commission + ", Total Salary: " + Calsalary();
	}

    
}//HR class ends here
class Admin extends Employee
{
	double allowance;

	Admin()//Default Constructor
	{
		super();
		System.out.println("Admin Default Constructor");
		this.allowance=2000;
	}
	Admin(int id, String name, double salary,double allowance) { //parameterize Constructor
		super(id, name, salary);
		System.out.println("Admin parameterize Constructor");
		this.allowance = allowance;
	}
	public String toString() 
	{
	    return super.toString() + ", Allowance is: " + allowance;
	}
	double Calsalary()
	{
		return salary+allowance;
	}
}//Admin class ends here
class SalesManager extends Employee
{
	double incentive;
	double target;
	
	SalesManager() {  //Default Constructor
		super();
		System.out.println("SalesManager Default Constructor");
		this.incentive=3000;
		this.target=5000;
	}
	
	SalesManager(int id, String name, double salary,double incentive,double target) {  //parameterize Constructor
		super(id, name, salary);
		System.out.println("SalesManager parameterize Constructor");
		this.incentive=incentive;
		this.target=target;
	}
	public String toString() 
	{
	    return super.toString() + ", Incentive is: " + incentive + ", Target is: " + target;
	}
	double Calsalary()
	{
		return salary+incentive;
	}
}//SalesManager class ends here
class AreaSalesManager extends SalesManager
{
	String areaName;

	AreaSalesManager() //Default Constructor
	{
		super();
		System.out.println("AreaSalesManager Default Constructor");
		this.areaName="Pune";
	}

	AreaSalesManager(int id, String name, double salary, double incentive, double target,String areaName) //parameterize Constructor
	{
		super(id, name, salary, incentive, target);
		System.out.println("AreaSalesManager parameterize Constructor");
		this.areaName=areaName;
	}
	public String toString() {
	    return super.toString() + ", AreaName is: " + areaName;
	}

}
class DemoInheritance
{
	public static void main(String[] args) {
		System.out.println("\n......Employee Info.....");
		
		Employee e2;//Generic reference
		//e2=new Employee(2,"Aishwarya",30000);
		
		//e2.Calsalary();
		//e2.Display();
		System.out.println("\n.....HR Info.......");
		
		
		 e2=new HR(3,"Riya",20000,5000);
		
		System.out.println(e2.Calsalary());
		System.out.println(e2.toString());
		System.out.println("\n.......Admin Info.....");
		
		e2=new Admin(4,"Rutuja",25000,2000);
		
		System.out.println(e2.Calsalary());
		System.out.println(e2.toString());
		System.out.println("\n......SalesManager Info......");
		
		e2=new SalesManager(5,"Neha",50000,5000,2000);
		
		System.out.println(e2.Calsalary());
		System.out.println(e2.toString());
		
		System.out.println("\n......AreaSalesManager Info......");
		
		e2=new AreaSalesManager(5,"Neha",50000,5000,2000,"Mumbai");
		System.out.println(e2.toString());
		
	}
}//DemoInheritance class ends here

