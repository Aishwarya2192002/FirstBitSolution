class Person 
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
	void Display()
    {
    	System.out.println("id is:"+this.id);
    	System.out.println("name is:"+this.name);
    }
      
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
	void Display()
    {
		super.Display();
    	System.out.println("Subject is:"+this.Subject);
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
	
}//Student class ends here
class DemoInheritancePerson
{
	public static void main(String[] args) 
	{
		System.out.println("\n.....Person........");
		Person p1 = new Person();
		p1.Display();
		
		Person p2 = new Person(1,"xyz");
		p2.Display();

		System.out.println("\n.....Teacher........");
		Teacher t1 = new Teacher();
		t1.Display();

		Teacher t2 = new Teacher(1,"xyz","Java");
		t2.Display();
		
		System.out.println("\n.....Student........");
		Student s1 = new Student();
		s1.Display();
		
		Student s2 = new Student(1,"xyz",15);
		s2.Display();

	}
}//DemoInheritancePerson class ends here