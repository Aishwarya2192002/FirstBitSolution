#include<stdio.h>
void greatest(int *a,int *b,int *c);
void main()
{
	int a,b,c;
	printf("Enter a Number:");
	scanf("%d",&a);
	printf("Enter a Number:");
	scanf("%d",&b);
	printf("Enter a Number:");
	scanf("%d",&c);
	greatest(&a,&b,&c);
}
void greatest(int *a,int *b,int *c)
{
	if(*a>=*b && *a>=*c)
	{
		printf("Greatest number is:%d",*a);
	}
	else if(*b>=*a && *b>=*c)
	{
	     printf("Greatest number is:%d",*b);
	}
	else
	{
		printf("Greatest number is:%d",*c);
	}
}
