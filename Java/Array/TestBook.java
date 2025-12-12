class Book
{
    String ISBN;
    String name,category;
    int price;
    Book()//default constructor
    {
       System.out.println("default Constructor called");
       this.ISBN="978-0135166307";
       this.name="Core Java";
       this.category="Programming";
       this.price=600;
     } 
     Book(String str1,String str2,String str3,int p)//parameterize constructor
    {
       System.out.println("parameterize Constructor called");
       this.ISBN=str1;
       this.name=str2;
       this.category=str3;
       this.price=p;
     } 
    void setISBN(String str1)
    {
       this.ISBN=str1;
    }
    void setName(String str2)
    {
       this.name=str2;
    }
    void setCategory(String str3)
    {
       this.category=str3;
    }
    void setPrice(int p)
    {
       this.price=p;
    }
    String getISBN()
    {
       return this.ISBN;
    }
    String getName()
    {
       return this.name;
    }
    String getCategory()
    {
       return this.category;
    }
    int getPrice()
    {
       return this.price;
    }
    void Display()
    {
          System.out.println("Book ISBN:"+this.ISBN);
          System.out.println("Book Name:"+this.name);
          System.out.println("Book Category:"+this.category);
          System.out.println("Book Price:"+this.price);
    }
}//Book ends here
class TestBook
{
    public static void main(String[]args)
    {
          Book [] arr=new Book[4];
          arr[0]=new Book();
          arr[1]=new Book("978-0135166307","Core Java","Programming",600);
          arr[2]=new Book();
          arr[3]=new Book();
          for(int i=0;i<arr.length;i++)
          {
               arr[i].Display();
          }
     }//main ends here
}//TestBook ends here
 