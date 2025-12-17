abstract class Shape {
	String color;

	Shape()//Default Constructor
	{
		System.out.println("Shape Default Constructor");
		this.color="Blue";
	}
	Shape(String color)//parameterize Constructor
	{
		System.out.println("Shape parameterize Constructor");
		this.color = color;
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}
    public String toString()
	{
		return "Color is:"+this.color;
	}
	abstract double calculateArea();
	

}//Shape class ends here
class Circle extends Shape
{
	double radius ;

	public Circle()//Default Constructor
	{
		super();
		System.out.println("Circle Default Constructor");
		this.radius=5.0;
	}
	public Circle(String color,double radius) //parameterize Constructor
	{
		super(color);
		System.out.println("Circle parameterize Constructor");
		this.radius=radius;
	}
    public String toString()
	{
		super.toString();
		return "Radius is:"+this.radius;
	}
	double calculateArea()
	{
	    return 3.14 * radius * radius;
	}

}//Circle class ends here
class Rectangle extends Shape
{
	double length ;
	double width ;
	public Rectangle() //Default Constructor
	{
		super();
		System.out.println("Rectangle Default Constructor");
		this.length=10.0;
		this.width=5.0;
	}
	public Rectangle(String color,double length,double width)//parameterize Constructor
	{
		super(color);
		System.out.println("Rectangle parameterize Constructor");
		this.length=length;
		this.width=width;
	}
    public String toString()
	{
		super.toString();
		return "length is:"+this.length+
		" width is:"+this.width;
	}
	double calculateArea()
	{
	    return length * width;
	}

}//Rectangle class ends here
class Triangle extends Shape
{
	double base ;
	double height ;
	Triangle()//Default Constructor
	{
		super();
		System.out.println("Triangle Default Constructor");
		this.base=6.0;
		this.height=8.0;
	}
	Triangle(String color,double base,double height)//parameterize Constructor
	{
		super(color);
		System.out.println("Triangle parameterize Constructor");
		this.base=base;
		this.height=height;
	}
    public String toString()
	{
		super.toString();
		return "Base is:"+this.base+
		"Height is:"+this.height;
	}
	double calculateArea()
	{
	    return 0.5 * base * height;
	}

}//Rectangle class ends here
class DemoInheritanceShape
{
	public static void main(String[] args) 
	{
		System.out.println("\n.....Shape........");
		Shape s2;
		//s2=new Shape ("Red");
		//System.out.println(s2.calculateArea());
		//s2.Display();
		
		System.out.println("\n.....Circle........");
		
		s2=new Circle ("Red",4);
		System.out.println(s2.calculateArea());
		System.out.println(s2.toString());
		
		System.out.println("\n.....Rectangle........");
		
		s2=new Rectangle ("Red",5,7);
		System.out.println(s2.calculateArea());
		System.out.println(s2.toString());
		
		System.out.println("\n.....Triangle........");
		
		
		s2=new Triangle ("Red",8,9);
		System.out.println(s2.calculateArea());
		System.out.println(s2.toString());
	}
}//DemoInheritanceShape class ends here



