#include<stdio.h>
void main()
{
	int a , b;
	char op;
	printf("Enter a number:");
	scanf("%d",&a);
	printf("Enter a number:");
	scanf("%d",&b);
	printf("Enter a choice(+,-,*,/):");
	scanf(" %c",&op);
	{
		if(op=='+')
		{
			printf("Addtion:%d",a+b);
		}
		else if(op=='-')
		{
			printf("Substraction:%d",a-b);
		}
		else if(op=='*')
		{
			printf("Multiplication:%d",a*b);
		}
		else if(op=='/')
		{
			printf("Divide:%d",a/b);
		}
		else
		{
			printf("Invalid Operator");
		}
	}
}
