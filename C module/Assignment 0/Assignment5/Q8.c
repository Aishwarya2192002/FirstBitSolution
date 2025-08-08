#include<stdio.h>
void main()
{
	int n=4;
    
    int i,j,k;
	for( i=1;i <= n;i++)
	{
		for(j=1;j <= i;j++)
		{
			printf("*");
			
		}
	   printf("\n");
	}
	for(i=n-1;i>=1;i--)	
	{
		for(j=1;j<=i;j++)
		{
			printf("*");
		}
		printf("\n");
	}
}
