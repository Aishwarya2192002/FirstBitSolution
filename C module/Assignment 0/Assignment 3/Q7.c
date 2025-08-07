#include<stdio.h>
void main()
{
	int n=5,fact=1;
	while(n>1)
	{
		fact=fact*n;
		n--;
	}
	printf("%d",fact);

}
