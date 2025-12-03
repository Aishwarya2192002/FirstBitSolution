class Student
{
     int rollno;
     String name;
     int marks;
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
         s1.setRollno(1);
         s1.setName("Aishwarya");
         s1.setMarks(96);
         s1.Display();
    }
    //main ends here
}
//TestStudent ends here

          