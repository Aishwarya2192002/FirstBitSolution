#include<stdio.h>
#include<string.h>
void main()
{
	char str1[]="Apple";
	char str2[]="Applicication";
	int result=strncmp(str1,str2,4);//strncmp
	if(result==0)
	{
		printf("first 3 character  are equal\n");
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
