abstract class Person 
{
      int id;
      String name;
      
     Person()//Default Constructor
     {
  		super();
  		System.out.println("Person Default Constructor");
  		this.id = 1;
  		this.name = "xyz";
  	}
	Person(int id, String name) //parameterize Constructor
	{
		super();
		System.out.println("Person parameterize Constructor");
		this.id = id;
		this.name = name;
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
	public String toString()
    {
    	return "id is:"+this.id+
    	"name is:"+this.name;
    }
	abstract String getRole();
	
}//Person class ends here
class Teacher extends Person 
{
	String Subject;

	Teacher() //Default Constructor
	{
		super();
		System.out.println("Teacher Default Constructor");
		this.Subject="Java";
	}

	Teacher(int id, String name,String Subject) //parameterize Constructor
	{
		super(id, name);
		System.out.println("Teacher parameterize Constructor");
		this.Subject=Subject;
	}
	public String toString()
    {
		super.toString();
    	return "Subject is:"+this.Subject;
    }
	String getRole()
	{
	    return "Person";
	}

}//Teacher class ends here
class Student extends Person
{
	int rollNo;

	Student() //Default Constructor
	{
		super();
		System.out.println("Student Default Constructor");
		this.rollNo=1;
	}

	Student(int id, String name,int rollNo)//parameterize Constructor
	{
		super(id, name);
		System.out.println("Student parameterize Constructor");
		this.rollNo=rollNo;
	}
	public String toString()
    { 
		super.toString();
    	return "rollNo is:"+this.rollNo;
    }
	String getRole()
	{
	    return "Student";
	}

}//Student class ends here
class DemoInheritancePerson
{
	public static void main(String[] args) 
	{
		System.out.println("\n.....Person........");
		Person p1 ;
		
		
		
		System.out.println("\n.....Teacher........");
		p1= new Teacher();
		System.out.println(p1.getRole());
		System.out.println(p1.toString());

		
		
		System.out.println("\n.....Student........");
		p1= new Student();
		System.out.println(p1.getRole());
		System.out.println(p1.toString());
		
		

	}
}//DemoInheritancePerson class ends here
