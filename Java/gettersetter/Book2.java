class Book
{
    String ISBN;
    String name,category;
    int price;
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
          Book b1=new Book();
          Book b2=new Book();
          b1.setISBN("978-0135166307");
          b1.setName("Core Java");
          b1.setCategory("Programming");
          b1.setPrice(500);
          b2.setISBN("978-0135166307");
          b2.setName("Core Java");
          b2.setCategory("Programming");
          b2.setPrice(500);
          b1.Display();
          b2.Display();
     }//main ends here
}//TestBook ends here
 