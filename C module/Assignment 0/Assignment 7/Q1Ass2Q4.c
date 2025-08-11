#include<stdio.h>
void mark(int *marks);
void main()
{
	int marks;
	printf("Enter a marks:");
	scanf("%d",&marks);
	mark(&marks);
}
void mark(int *marks)
{
	if(*marks>=75)
	{
		printf("Distinction");
	}
	else if(*marks>=65)
	{
		printf("First Class");
	}
	else if(*marks>=55)
	{
		printf("second Class");
	}
	else if(*marks>=40)
	{
		printf("pass");
	}
	else
	{
		 printf("Fail");
	}
}
