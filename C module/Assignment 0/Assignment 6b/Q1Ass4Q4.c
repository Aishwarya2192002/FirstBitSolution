#include<stdio.h>
void strong(int *n);
void main()
{
	int n;
	printf("Enter a Number n:");
	scanf("%d",&n);
    strong(&n);
}
void strong(int *n)
{
	int i,j,sum,temp,digit,fact;
	printf("strong number between 1 & %d is :\n",*n);
	for(i=1;i<=*n;i++)
	{
		temp=i;
		sum=0;
		while(temp>0)
		{
			digit=temp%10;
			fact=1;
			for(j=1;j<=digit;j++)
			{
				fact=fact*j;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		if(sum==i)
		{
			printf("%d ", i);
		}
	}
}
