#include<stdio.h>
void prime(int *n);
void main()
{
	int n;
	printf("Enter a Number n:");
	scanf("%d",&n);
	prime(&n);
}
void prime(int *n)
{
	int i,j,isprime;
	printf("prime number between 1 & %d is :\n",n);
	for(i=2;i<=*n;i++)
	{
		isprime=1;
		for(j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
				isprime=0;
				break;
			}
		}
		if(isprime==1)
		{
			printf("%d ",i);
		}
	}
	printf("\n ");
}
