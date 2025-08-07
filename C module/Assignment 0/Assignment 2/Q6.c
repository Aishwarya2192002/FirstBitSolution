#include<stdio.h>
void main()
{
	int no=9;
	if(no%3==0 && no%5==0)
	{
		printf("Both divisible");
	}
	else if(no%3==0 && no%5!=0)
	{
		printf("Divisible by 3");
	}
	else if(no%3!=0 && no%5==0)
	{
		printf("Divisible by 5");
	}
	else
	{
		printf("not divisible");
	}
}
