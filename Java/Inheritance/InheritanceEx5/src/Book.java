
class Book
{
     String title;
     String author;
     
      Book()//Default Constructor
      {
         super();
         System.out.println("Book Default Constructor");
         this.title="Java Basics";
         this.author="James";
      }
      Book(String title,String author)//parameterize Constructor
      {
         super();
         System.out.println("Book parameterize Constructor");
         this.title=title;
         this.author=author;
      }
      void Display()
      {
          System.out.println("Title is:"+this.title);   
          System.out.println("Author is:"+this.author);
      }
}// Book class ends here
class ReferenceBook extends Book
{
      String subject;
        
       ReferenceBook()//Default Constructor
       {
          super();
          System.out.println("ReferenceBook Default Constructor");
          this.subject="Computer Science";
       }
       ReferenceBook(String title,String Author,String subject)//parameterize Constructor
       {
          super(title,Author);
          System.out.println("ReferenceBook parameterize Constructor");
          this.subject=subject;
       }
       void Display()
       {
           super.Display();
           System.out.println("Subject is:"+this.subject);
       }
}//ReferenceBook class ends here
class DemoInheritanceBook
{
     public static void main(String[] args)
     {
        System.out.println("\n.....Book........");
        Book b1 = new Book();
        b1.Display();
        Book b2 = new Book("C Programming", "Dennis");
        b2.Display();

        System.out.println("\n.....ReferenceBook........");
        ReferenceBook r1 = new ReferenceBook();
        r1.Display();
        ReferenceBook r2 = new ReferenceBook("Data Structures", "Mark", "CS");
        r2.Display();
         
      }
}//DemoInheritanceBook class ends here
