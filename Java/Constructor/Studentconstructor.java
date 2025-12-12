class Student
{
     int rollno;
     String name;
     int marks;
    Student()//default constructor
    {
       System.out.println("default Constructor called");
       this.rollno=3;
       this.name="Mayuri";
       this.marks=80;
       
     } 
     Student(int d,String str,int m)//parameterize constructor
    {
       System.out.println("parameterize Constructor called");
       this.rollno=d;
       this.name=str;
       this.marks=m;
     
     }
     void setRollno(int r)
     {
        this.rollno=r;
     }
     void setName(String str)
     {
        this.name=str;
     }
     void setMarks(int m)
     {
         this.marks=m;
     }
     int getRollno()
     {
        return this.rollno;
     }
     String getName()
     {
        return this.name;
     }
     int getMarks()
     {
         return this.marks;
     }
     void Display()
     {
           System.out.println("Student Rollno:"+this.rollno);
           System.out.println("Student name:"+this.name);
           System.out.println("Student Marks:"+this.marks);
     }
}
//Student ends here
class TestStudent
{
    public static void main(String[]args)
    {
         Student s1=new Student();
         Student s2=new Student();
         Student s3=new Student(3,"Priya",90);
         s1.setRollno(1);
         s1.setName("Aishwarya");
         s1.setMarks(96);
         s1.Display();
         s2.Display();
         s3.Display();
    }
    //main ends here
}
//TestStudent ends here

          