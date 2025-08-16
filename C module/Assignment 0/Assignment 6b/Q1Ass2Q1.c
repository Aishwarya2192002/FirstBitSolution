#include<stdio.h>
void calculator(int *a,int *b);
void main()
{ 
    int a,b;
    printf("Enter a Number:");
	scanf("%d",&a);
	printf("Enter a Number:");
	scanf("%d",&b);
	calculator(&a,&b);
}
void calculator(int *a ,int *b)
{
	char op;
	printf("Enter a choice(+,-,*,/):");
	scanf(" %c",&op);
	{
		if(op=='+')
		{
			printf("Addtion:%d",*a+*b);
		}
		else if(op=='-')
		{
			printf("Substraction:%d",*a-*b);
		}
		else if(op=='*')
		{
			printf("Multiplication:%d",*a**b);
		}
		else if(op=='/')
		{
			printf("Divide:%d",*a / *b);
		}
		else
		{
			printf("Invalid Operator");
		}
	}
}
