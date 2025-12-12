class Shape
{
     void Triangle(int base,int height)
     {
         System.out.println("Area of Triangle is:"+(0.5 * base * height));
     }
     void Rectangle(double length,double breadth)
     {
         System.out.println("Area of Rectangle is:"+(length * breadth));
     }
     void Circle(int radius)
     {
          System.out.println("Area of Circle is:"+(3.14 * radius * radius));
     }
}
class TestShape
{
      public static void main(String[]args)
      {
          Shape s=new Shape();
          s.Triangle(10,5);
          s.Rectangle(4,5);
          s.Circle(4);
      }
}