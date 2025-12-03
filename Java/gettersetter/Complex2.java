class Complex
{
    int real,imaginary;
    void setReal(int r)
    {
       this.real=r;
    }
    void setImaginary(int i)
    {
       this.imaginary=i;
    }
    int getReal()
    {
       return this.real;
    }
    int getImaginary(int i)
    {
      return this.imaginary;
    }
    void Display()
    {
        System.out.println("Complex Number: "+this.real+ "+" +this.imaginary+ "i");
    }
}//complex ends here
class TestComplex
{
     public static void main(String[]args)
     {
          Complex c=new Complex();
          c.setReal(3);
          c.setImaginary(2);
          c.Display();
          
     }//main ends here
}//TestComplex ends here