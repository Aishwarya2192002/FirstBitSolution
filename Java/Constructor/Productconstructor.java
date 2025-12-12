class Product
{
   int productid;
   String name;
   int price,quantity;
    Product()//default constructor
    {
        System.out.println("default Constructor called");
        this.productid=2;
        this.name="Pen";
        this.price=10;
        this.quantity=1;
    }
    Product(int d,String str,int p,int q)//parameterize constructor
    {
        System.out.println("parameterize Constructor called");
        this.productid=d;
        this.name=str;
        this.price=p;
        this.quantity=q;
    }
   void setId(int d)
   {
       this.productid=d;
   }
   void setName(String str)
   {
        this.name=str;
   }
   void setPrice(int p)
   {
         this.price=p;
   }
   void setQuantity(int q)
   {
        this.quantity=q;
   }
   int getId()
   {
       return this.productid;
   }
   String getName()
   {
        return this.name;
   }
   int getPrice()
   {
         return this.price;
   }
   int getQuantity()
   {
        return this.quantity;
   }
   void Display()
   {
          System.out.println("productid:"+this.productid);
          System.out.println("productName:"+this.name);
          System.out.println("productPrice:"+this.price);
          System.out.println("productQuantity:"+this.quantity); 
   }
}
//product ends here
class TestProduct
{
     public static void main(String[]args)
     {
          Product p1=new Product();
          Product p2=new Product();
          Product p3=new Product(3,"Rubber",5,2);
          p1.setId(1);
          p1.setName("Facewash");
          p1.setPrice(200);
          p1.setQuantity(1);
          p1.Display();  
          p2.Display(); 
          p3.Display(); 
     }
      //main ends here
}
//TestProduct ends here
    
  