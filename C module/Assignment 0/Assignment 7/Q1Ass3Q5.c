#include<stdio.h>
void armstrong(int *n);
void main()
{
	int n;
	printf("Enter the number :");
	scanf("%d",&n);
	armstrong(&n);
}
void armstrong(int *n)
{
	int temp=*n;
	int sum=0,rem;
	while(*n>0)
	{
		rem=*n%10;
		sum=sum+(rem*rem*rem);
		*n=*n/10;
	}
	if(temp==sum)
	{
		printf("Armstrong Number");
	}
	else
	{
		printf("Not Armstrong");
	}
}
