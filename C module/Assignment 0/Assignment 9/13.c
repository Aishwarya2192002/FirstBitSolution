#include<stdio.h>
#include<string.h>
void main()
{
	char str1[]="Apple";
	char str2[]="Apply";
	int result=strncasecmp(str1,str2,5);
	if(result==0)
	{
		printf("String are equal\n");
	}
	else if(result<0)
	{
		printf("First String is Smaller\n");
	}
	else
	{
		printf("First String is Greater\n");
    }
	printf("%d",result);
}
