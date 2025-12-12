class Student {
      int fbId;
      String name;
      int distance;
      static int count=0;
      
      Student()
      {
    	  System.out.println("Student default constructor");
    	  fbId = 101;
    	  name="not given";
    	  distance=10;
    	  count++;
      }//default constructor
      
	  Student(int fbId, String name, int distance) {
		
	    System.out.println("Student parameterized constructor");
		this.fbId = fbId;
		this.name = name;
		this.distance = distance;
		count++;
	}//parameterized constructor

	int getFbId() {
		return fbId;
	}
	void setFbId(int fbId) {
		this.fbId = fbId;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getDistance() {
		return distance;
	}
	void setDistance(int distance) {
		this.distance = distance;
	}
	static int getCount() {
		return count;
	}
	static void setCount(int count) {
		Student.count = count;
	}
	void display()
	{
		System.out.println("Firstbit Id is:"+this.fbId);
		System.out.println("Name is:"+this.name);
		System.out.println("Distance Travelled:"+this.distance);
	}
      
}//class Student ends here
class PlaceStudent extends Student//step 1PlaceStudent is a Student
{
	//step 2 remove state and behavior which is available in super class
    String companyName;
    String designation;
    
    PlaceStudent()
    {
    	super();//step 3a
    	System.out.println("PlaceStuden default constructor");
  	    companyName="xyz";
  	    designation ="pqr";
    }//default constructor
	PlaceStudent(int fbId, String name, int distance, String companyName, String designation) {
		
	    super(fbId,name,distance);//step 3b
		System.out.println("PlaceStuden parameterized constructor");
		this.companyName = companyName;
		this.designation = designation;
	}//parameterize constructor
	
	String getCompanyName() {
		return companyName;
	}
	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	String getDesignation() {
		return designation;
	}
	void setDesignation(String designation) {
		this.designation = designation;
	}
	void display()
	{
		super.display();//step 4
		System.out.println("Company Name is:"+this.companyName);
		System.out.println("Designation is:"+this.designation);
	}
}//class PlaceStudent ends here
class DemoInheritance
{
	public static void main(String[] args) {
				
		PlaceStudent ps2=new PlaceStudent();
		ps2.display();
		System.out.println(ps2.getName());
		PlaceStudent ps1=new PlaceStudent(78,"Riya",5000,"bcc","writer");
		System.out.println("Student total count: "+Student.getCount());
		
	}
}