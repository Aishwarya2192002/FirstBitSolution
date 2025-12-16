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
		System.out.println("Doctor Default Constructor");
		this.specialization = "Cardiology";
		this.qualification = "MBBS, MD";
		this.patientsPerDay = 30;
	}
	public Doctor(int staffId, String name, String department, int experienceYears,String specialization,String qualification,int patientsPerDay) 
	{
		super(staffId, name, department, experienceYears);
		System.out.println("Doctor parameterize Constructor");
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
    	super.Display();
    	System.out.println("specialization is:"+this.specialization);
    	System.out.println("qualification is:"+this.qualification);
    	System.out.println("patientsPerDay is:"+this.patientsPerDay);
    }
	
}//Doctor class ends here
class Nurse extends HospitalStaff
{
	String shiftType;
	String assignedWard;
	int patientsAssigned;
	public Nurse() {
		super();
		System.out.println("Nurse Default Constructor");
		this.shiftType = "Night Shift";
		this.assignedWard = "ICU";
		this.patientsAssigned = 12;
	}
	public Nurse(int staffId, String name, String department, int experienceYears,String shiftType,String assignedWard,int patientsAssigned) 
	{
		super(staffId, name, department, experienceYears);
		System.out.println(" Nurse parameterize Constructor");
		this.shiftType = shiftType;
		this.assignedWard = assignedWard;
		this.patientsAssigned = patientsAssigned;
	}
	void performDuty()
    {
    	System.out.println("Nurse is taking care of patients and assisting doctors.");
    }
    void Display()
    {
    	super.Display();
    	System.out.println("shiftType is:"+this.shiftType);
    	System.out.println("assignedWard is:"+this.assignedWard);
    	System.out.println("patientsAssigned is:"+this.patientsAssigned);
    }
	
}//Nurse class ends here
class Receptionist extends HospitalStaff
{
	int deskNumber;
	String languagesKnown;
	public Receptionist() {
		super();
		System.out.println("Receptionist Default Constructor");
		this.deskNumber = 3;
		this.languagesKnown = "English, Hindi";
	}
	public Receptionist(int staffId, String name, String department, int experienceYears,int deskNumber,String languagesKnown)
	{
		super(staffId, name, department, experienceYears);
		System.out.println(" Receptionist parameterize Constructor");
		this.deskNumber = deskNumber;
		this.languagesKnown = languagesKnown;
	}
	void performDuty()
    {
    	System.out.println("Receptionist is managing appointments and patient records.");
    }
    void Display()
    {
    	super.Display();
    	System.out.println("deskNumber is:"+this.deskNumber);
    	System.out.println("languagesKnown is:"+this.languagesKnown);
    }
	
}//Receptionist class ends here
class DemoInheritanceHospitalStaff
{
	public static void main(String[] args)
	{
		System.out.println("\n......HospitalStaff Info......");
		HospitalStaff h;
		h=new HospitalStaff();
		h.performDuty();
		h.Display();
		
		System.out.println("\n......Doctor Info......");
		h=new Doctor();
		h.performDuty();
		h.Display();
		
		System.out.println("\n......Nurse Info......");
		h=new Nurse();
		h.performDuty();
		h.Display();
		
		System.out.println("\n......Receptionist Info......");
		h=new Receptionist();
		h.performDuty();
		h.Display();
		
	}
}
