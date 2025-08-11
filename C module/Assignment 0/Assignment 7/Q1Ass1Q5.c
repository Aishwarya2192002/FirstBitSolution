#include<stdio.h>
void vote(int *age);
void main()
{
	int age;
	printf("Enter a age:");
	scanf("%d",&age);
   vote(&age);
}
void vote(int *age)
{
    if(*age>=18)
    {
        printf("Eligible for vote");
    }
    else
    {
        printf("not eligible for vote");
    }
}
