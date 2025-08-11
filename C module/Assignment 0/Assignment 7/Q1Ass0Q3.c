#include<stdio.h>
void fahrenheit(int *c);
void main()
{
	int c;
	printf("Enter a number:");
	scanf("%d",&c);
    fahrenheit(&c);
   
}
void fahrenheit(int *c)
{
    float f=(*c*9/5)+32;
     printf("%f",f);
}
