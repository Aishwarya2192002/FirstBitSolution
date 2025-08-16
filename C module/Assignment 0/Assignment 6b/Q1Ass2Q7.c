#include<stdio.h>
void ages(int *age);
void main()
{
	int age;
	printf("Enter a Number:");
	scanf("%d",&age);
	ages(&age);
}
void ages(int *age)
{
	if(*age<12)
	{
		printf("Child");
	}
	else if(*age<=12)
	{
		printf("Teenager");
	}
	else if(*age<=59)
	{
		printf("Adult");
	}
	else 
	{
		printf("Senior");
	}
}
