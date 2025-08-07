#include<stdio.h>
void main()
{
	int a=80,b=40,c=95;
	if(a>=b && a>=c)
	{
		printf("Greatest No. is:%d",a);
	}
	else if(b>=a && a>=c)
	{
		printf("Greatest No. is:%d",b);
	}
	else
	{
		printf("Greatest No. is:%d",c);
	}
}
