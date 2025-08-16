#include<stdio.h>
void pallindrome(int *num);
void main()
{
	int num;
	printf("Enter a number:");
	scanf("%d",&num);
    pallindrome(&num);
}
void pallindrome(int *num)
{
	int r1,r2,r3,q1,rev;
    r1=*num%10;
    q1=*num/10;
    r2=q1%10;
    r3=q1/10;
    rev=r1*100+r2*10+r3;
    if(*num==rev)
        printf("Pallindrome");
    else
        printf("Not Pallindrome");
}
