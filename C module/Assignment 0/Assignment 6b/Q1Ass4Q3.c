#include<stdio.h>
void perfect(int *n);
void main()
{
	int n;
	printf("Enter a Number n:");
	scanf("%d",&n);
    perfect(&n);
}
void perfect(int *n)
{
	int i,j,sum;
	printf("perfect number between 1 & %d is :\n",*n);
	for(i=1;i<= *n;i++)
	{
		sum=0;
		for(j=1;j<= i/2;j++)
		{
			if(i%j==0)
			{
				sum=sum+j;
			}
		}
		if(sum==i)
		{
			printf("%d ", i);
		}
	}
	printf("\n");
}
