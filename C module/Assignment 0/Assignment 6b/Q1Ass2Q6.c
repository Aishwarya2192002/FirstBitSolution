#include<stdio.h>
void divisible(int *no);
void main()
{
	int no;
	printf("Enter a Number:");
	scanf("%d",&no);
   divisible(&no);
   
}
void divisible(int *no)
{
	if(*no%3==0 && *no%5==0)
	{
		printf("Both divisible");
	}
	else if(*no%3==0 && *no%5!=0)
	{
		printf("Divisible by 3");
	}
	else if(*no%3!=0 && *no%5==0)
	{
		printf("Divisible by 5");
	}
	else
	{
		printf("not divisible");
	}
}
