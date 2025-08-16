#include<stdio.h>
void add(int *no1 ,int *no2);
void main()
{
	int no1, no2;
	printf("Enter a number:");
	scanf("%d",&no1);
	printf("Enter a number:");
	scanf("%d",&no2);
	add(&no1,&no2);
}
void add(int *no1 ,int *no2)
{
    int res=*no1+*no2;
    printf("%d",res);
}
