class Student
{
     int rollno;
     String name;
     int marks;
    Student()//default constructor
    {
       System.out.println("default Constructor called");
       this.rollno=1;
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
         Student [] arr=new Student[3];
         arr[0]=new Student();
         arr[1]=new Student();
         arr[2]=new Student(3,"Priya",90);
         for(int i=0;i<arr.length;i++)
         {
               arr[i].Display();
         }
    }
    //main ends here
}
//TestStudent ends here

          