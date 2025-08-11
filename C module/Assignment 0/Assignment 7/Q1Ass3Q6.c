#include<stdio.h>
void perfect(int *n);
void main()
{
	int n;
	printf("Enter the number :");
	scanf("%d",&n);
	perfect(&n);
}
void perfect(int *n)
{
	int temp=*n;
	int i=1,sum=0;
	while(i<*n)
	{
		if(*n%i==0)
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

