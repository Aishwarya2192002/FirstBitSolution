#include<stdio.h>
#include<string.h>
void main()
{
	char str1[]="Apple";
	char str2[]="Apply";
	int res=strcmp(str1,str2);//strcmp
	if(res==0)
	{
		printf("String are equal\n");
	}
	else if(res<0)
	{
		printf("First String is smaller\n");
	}
	else
	{
		printf("First String is greater\n");
	}
	printf("%d",res);
}
