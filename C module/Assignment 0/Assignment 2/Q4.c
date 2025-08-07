#include<stdio.h>
void main()
{
	int marks=95;
	
	if(marks>=75)
	{
		printf("Distinction");
	}
	else if(marks>=65)
	{
		printf("First Class");
	}
	else if(marks>=55)
	{
		printf("second Class");
	}
	else if(marks>=40)
	{
		printf("pass");
	}
	else
	{
		printf("Fail");
	}
}
