#include<stdio.h>
void main()
{
	int s1,s2,s3;
	printf("Enter a side:");
	scanf("%d",&s1);
	printf("Enter a side:");
	scanf("%d",&s2);
	printf("Enter a side:");
	scanf("%d",&s3);
	
	if(s1==s2 && s2==s3)
	{
		printf("This is equilateral triangle");
	}
	else if(s1==s2 || s2==s3 || s1==s3)
	{
		printf("This isocale triangle");
	}
	else
	{
		printf("wrong");
	}
}
