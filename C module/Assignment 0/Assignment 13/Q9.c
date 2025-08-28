#include<stdio.h>
struct Complex
{
	int real;
	int imaginary;
};
void main()
{
	struct Complex c1;
	printf("Enter Real Part:");
	scanf("%d",&c1.real);
	printf("Enter Imaginary Part:");
	scanf("%d",&c1.imaginary);
	if(c1.imaginary>=0)
	{
		printf("%d + %.di\n",c1.real,c1.imaginary);
	}
	else
	{
		printf("%d - %.di\n",c1.real,c1.imaginary);
	}
}
