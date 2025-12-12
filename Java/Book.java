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
}//Book ends here
class TestBook
{
    public static void main(String[]args)
    {
          Book b1=new Book();
          b1.setISBN("978-0135166307");
          b1.setName("Core Java");
          b1.setCategory("Programming");
          b1.setPrice(500);
          System.out.println("Book ISBN:"+b1.ISBN);
          System.out.println("Book Name:"+b1.name);
          System.out.println("Book Category:"+b1.category);
          System.out.println("Book Price:"+b1.price);
     }//main ends here
}//TestBook ends here
 