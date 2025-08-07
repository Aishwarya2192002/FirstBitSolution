#include<stdio.h>
void main()
{
	int n=28;
	int temp=n;
	int i=1,sum=0;
	while(i<n)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
		i++;
	}
	if(sum==temp)
	{
		printf("Perfect Number");
	}
	else
	{
		printf("Not Perfect Number");
	}
}
