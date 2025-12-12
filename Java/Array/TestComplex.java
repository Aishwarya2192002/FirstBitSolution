class Complex
{
    int real,imaginary;
    Complex()//default constructor
    {
       System.out.println("default Constructor called");
       this.real=5;
       this.imaginary=4;
    }
     Complex(int r,int i)//parameterize constructor
    {
       System.out.println("parameterize Constructor called");
       this.real=r;
       this.imaginary=i;
    }
       
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
    int getImaginary()
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
          Complex [] arr=new Complex[2];
          arr[0]=new Complex();
          arr[1]=new Complex(9,7);
          for(int i=0;i<arr.length;i++)
          {
                arr[i].Display();
          }
          
     }//main ends here
}//TestComplex ends here