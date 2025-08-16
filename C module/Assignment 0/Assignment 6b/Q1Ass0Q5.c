#include<stdio.h>
void average(int *num1,int *num2,int *num3,int *num4,int *num5);
void main()
{
   int num1,num2,num3,num4,num5;
   	printf("Enter a number:");
	scanf("%d",&num1);
	printf("Enter a number:");
	scanf("%d",&num2);
	printf("Enter a number:");
	scanf("%d",&num3);
	printf("Enter a number:");
	scanf("%d",&num4);
	printf("Enter a number:");
	scanf("%d",&num5);
   average(&num1,&num2,&num3,&num4,&num5);
   
}
void average(int *num1,int *num2,int *num3,int *num4,int *num5)
{
    int sum=*num1+*num2+*num3+*num4+*num5;
    int avg=sum/5;
    printf("The average is:%d",avg);
}
