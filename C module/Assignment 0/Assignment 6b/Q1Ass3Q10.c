#include<stdio.h>
void fl(int *n);
void main()
{
	int n;
	printf("Enter the number :");
	scanf("%d",&n);
	fl(&n);
}
void fl(int *n)
{
	int rem,sum;
	int firstdigit=1;
	int lastdigit=*n%10;
	while(*n>0)
	{
		rem=*n%10;
		*n=*n/10;
		sum=lastdigit+rem;
	}
	printf("%d",sum);
}
