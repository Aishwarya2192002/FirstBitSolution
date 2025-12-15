class Shape {
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
	void Display()
	{
		System.out.println("Color is:"+this.color);
	}
	double calculateArea()
	{
	    return 0;
	}

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
	void Display()
	{
		super.Display();
		System.out.println("Radius is:"+this.radius);
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
	void Display()
	{
		super.Display();
		System.out.println("length is:"+this.length);
		System.out.println(" width is:"+this.width);
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
	void Display()
	{
		super.Display();
		System.out.println("Base is:"+this.base);
		System.out.println("Height is:"+this.height);
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
		s2=new Shape ("Red");
		System.out.println(s2.calculateArea());
		s2.Display();
		
		System.out.println("\n.....Circle........");
		
		s2=new Circle ("Red",4);
		System.out.println(s2.calculateArea());
		s2.Display();
		
		System.out.println("\n.....Rectangle........");
		
		s2=new Rectangle ("Red",5,7);
		System.out.println(s2.calculateArea());
		s2.Display();
		
		System.out.println("\n.....Triangle........");
		
		
		s2=new Triangle ("Red",8,9);
		System.out.println(s2.calculateArea());
		s2.Display();
		
	}
}//DemoInheritanceShape class ends here


