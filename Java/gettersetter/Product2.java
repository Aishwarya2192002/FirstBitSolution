class Product
{
   int productid;
   String name;
   int price,quantity;
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
          p1.setId(1);
          p1.setName("Facewash");
          p1.setPrice(200);
          p1.setQuantity(1);
          p1.Display();  
     }
      //main ends here
}
//TestProduct ends here
    
  