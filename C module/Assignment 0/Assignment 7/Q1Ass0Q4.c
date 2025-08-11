#include<stdio.h>
void swap(int *a,int *b);
void main()
{
	int a,b;
	printf("Enter a number:");
	scanf("%d",&a);
	printf("Enter a number:");
	scanf("%d",&b);
   swap(&a,&b);
   printf("a=%d \nb=%d",a,b);
}
void swap(int *a,int *b)
{
	int temp;
    temp=*a;
    *a=*b;
    *b=temp;
    
}
