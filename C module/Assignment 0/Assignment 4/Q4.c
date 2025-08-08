#include<stdio.h>
void main()
{
	int n;
	int i,j,sum,temp,digit,fact;
	printf("Enter a Number n:");
	scanf("%d",&n);
	printf("strong number between 1 & %d is :\n",n);
	for(i=1;i<=n;i++)
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
