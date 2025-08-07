#include<stdio.h>
void main()
{
	int n=4;
	int i=2,flag=0;
	while(i<=n/2)
	{
		if(n%i==0)
		{
			flag=1;
			break;
		}
		i++;
    }
		if(flag==0)
		{
			printf("prime number");
		}
		else 
		{
			printf("not prime number");
		}
	
}
