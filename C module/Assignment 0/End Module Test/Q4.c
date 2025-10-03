#include<stdio.h>
void main()
{
	int n;
	int i,j,isprime,sum=0;
	printf("Enter a Number n:");
	scanf("%d",&n);
	printf("prime number between 1 & %d is :\n",n);
	for(i=2;i<=n;i++)
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
			sum=sum+i;
			printf("%d",i);
		}
	}
	printf("\n");
}
