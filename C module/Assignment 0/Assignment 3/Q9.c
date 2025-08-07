#include<stdio.h>
void main()
{
	int n=121;
	int temp=n;
	int rev=0,rem;
	while(n>0)
	{
		rem=n%10;
		rev=rev * 10+rem;
		n=n/10;
    }
	if(rev==temp)
	{
		printf("Palindrome");
	}
	else
	{
		printf("Not Palindrome");
	}
}
