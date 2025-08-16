#include<stdio.h>
void area(int *height,int *base);
void main()
{
	int height,base;
	printf("Enter a height:");
	scanf("%d",&height);
	printf("Enter a base:");
	scanf("%d",&base);
	area(&height,&base);
   
}
void area(int *height,int *base)
{
    float res=(*base**height)/2;
    printf("The area of triangle is:%2f",res);
}
