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
          Product [] arr=new Product[4];
          arr[0]=new Product();
          arr[1]=new Product(3,"Rubber",5,2);
          arr[2]=new Product();
          arr[3]=new Product();
          for(int i=0;i<arr.length;i++)
          {
                 arr[i].Display();
          }
     }
      //main ends here
}
//TestProduct ends here
    
  