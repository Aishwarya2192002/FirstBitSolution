#include<stdio.h>
void main()
{
	int n=12345;
	int rem,sum;
	int firstdigit=1;
	int lastdigit=n%10;
	while(n>0)
	{
		rem=n%10;
		n=n/10;
		sum=lastdigit+rem;
	}
	printf("%d(%d + %d)",sum,firstdigit,lastdigit);
}
