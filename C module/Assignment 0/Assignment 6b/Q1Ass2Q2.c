#include<stdio.h>
void side(int *s1,int *s2,int *s3);
void main()
{
	int s1, s2, s3;
	printf("Enter a side:");
	scanf("%d",&s1);
	printf("Enter a side:");
	scanf("%d",&s2);
	printf("Enter a side:");
	scanf("%d",&s3);
    side(&s1,&s2,&s3);
}
void side(int *s1,int *s2,int *s3)
{
	if(*s1==*s2 && *s2==*s3)
	{
		printf("equilateral triangle");
	}
	else if(*s1==*s2 || *s2==*s3 || *s1==*s3)
	{
		printf("isocale triangle");
	}
	else
	{
		printf("wrong");
	}
}
