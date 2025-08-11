#include<stdio.h>
void evenodd(int *num);
void main()
{
	int num;
	printf("Enter a number:");
	scanf("%d",&num);
    evenodd(&num);
}
void evenodd(int *num)
{
    if(*num%2==0)
         printf("Even Number");
    else
         printf("Odd Number");
}
