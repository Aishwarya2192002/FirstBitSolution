#include<stdio.h>
void rectangle(int *len,int *width);
void main()
{
	int len,width;
	printf("Enter a Length:");
	scanf("%d",&len);
	printf("Enter a Width:");
	scanf("%d",&width);
    rectangle(&len,&width);
}
void rectangle(int *len,int *width)
{
    float p=2*(*len+*width);
    printf("The Perimeter of Rectangle is:%f",p);
}
