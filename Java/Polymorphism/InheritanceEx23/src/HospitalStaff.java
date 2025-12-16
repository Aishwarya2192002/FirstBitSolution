class HospitalStaff 
{
      int staffId;
      String name;
      String department;
      int experienceYears;
      
    HospitalStaff() 
  	{
  		super();
  		System.out.println("HospitalStaff Default Constructor");
  		this.staffId = 101;
  		this.name = "Riya";
  		this.department = "General";
  		this.experienceYears =5;
  	}
	HospitalStaff(int staffId, String name, String department, int experienceYears) 
	{
		super();
		System.out.println("HospitalStaff parameterize Constructor");
		this.staffId = staffId;
		this.name = name;
		this.department = department;
		this.experienceYears = experienceYears;
	}
    void performDuty()
    {
    	System.out.println("work");
    }
    void Display()
    {
    	System.out.println("staffId is:"+this.staffId);
    	System.out.println("name is:"+this.name);
    	System.out.println("department is:"+this.department);
    	System.out.println("experienceYears is:"+this.experienceYears);
    }
      
}//HospitalStaff class ends here
class Doctor extends HospitalStaff
{
	String specialization;
	String qualification;
	int patientsPerDay;
	public Doctor() {
		super();
		System.out.println("Doctor parameterize Constructor");
		this.specialization = specialization;
		this.qualification = qualification;
		this.patientsPerDay = patientsPerDay;
	}
	public Doctor(int staffId, String name, String department, int experienceYears,String specialization,String qualification,int patientsPerDay) 
	{
		super(staffId, name, department, experienceYears);
		System.out.println("Doctor   parameterize Constructor");
		this.specialization = specialization;
		this.qualification = qualification;
		this.patientsPerDay = patientsPerDay;
	}
	void performDuty()
    {
    	System.out.println("Doctor is diagnosing patients and providing treatment.");
    }
    void Display()
    {
    	System.out.println("staffId is:"+this.staffId);
    	System.out.println("name is:"+this.name);
    	System.out.println("department is:"+this.department);
    	System.out.println("experienceYears is:"+this.experienceYears);
    }
	
}
