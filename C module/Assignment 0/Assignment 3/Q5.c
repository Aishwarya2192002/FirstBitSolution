#include<stdio.h>
void main()
{
	int n=153;
	int temp=n;
	int sum=0,rem;
	while(n>0)
	{
		rem=n%10;
		sum=sum+(rem*rem*rem);
		n=n/10;
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
