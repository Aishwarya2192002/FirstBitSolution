class Calculator
{
    void Add(int a,int b)
    {
       System.out.println("Addition is:"+(a+b));
    }
    void Add(float f,int a)
    {
       System.out.println("Addition is:"+(f+a));
    }
    void Add(int a,float f)
    {
       System.out.println("Addition is:"+(a+f));
    }
    void Add(double d,double c)
    {
       System.out.println("Addition is:"+(d+c));
    }
    void Sub(int a,int b)
    {
       System.out.println("Substraction is:"+(a-b));
    }
    void Sub(float f,int a)
    {
       System.out.println("Substraction is:"+(f-a));
    }
    void Sub(int a,float f)
    {
       System.out.println("Substraction is:"+(a-f));
    }
    void Sub(double d,double c)
    {
       System.out.println("Substraction is:"+(d-c));
    }
    void Multi(int a,int b)
    {
       System.out.println("Multiplication is:"+(a*b));
    }
    void Multi(float f,int a)
    {
       System.out.println("Multiplication is:"+(f*a));
    }
    void Multi(int a,float f)
    {
       System.out.println("Multiplication is:"+(a*f));
    }
    void Multi(double d,double c)
    {
       System.out.println("Multiplication is:"+(d*c));
    }
     void Div(int a,int b)
    {
       System.out.println("Division is:"+(a/b));
    }
    void Div(float f,int a)
    {
       System.out.println("Division is:"+(f/a));
    }
    void Div(int a,float f)
    {
       System.out.println("Division is:"+(a/f));
    }
    void Div(double d,double c)
    {
       System.out.println("Division is:"+(d/c));
    }
}
//Calculator ends here
class TestCalculator
{
       public static void main(String[]args)
       {
           Calculator c1=new Calculator();
           int a=10;
           double d=10.5;
           float f=10.3;
           c1.Add(a,a);
           c1.Add(f,a);
           c1.Add(a,f);
           c1.Add(d,d);
           c1.Sub(a,a);
           c1.Sub(f,a);
           c1.Sub(a,f);
           c1.Sub(d,d);
           c1.Multi(a,a);
           c1.Multi(f,a);
           c1.Multi(a,f);
           c1.Multi(d,d);
           c1.Div(a,a);
           c1.Div(f,a);
           c1.Div(a,f);
           c1.Div(d,d);
       }
}
//TestCalculator ends here