#include<stdio.h>
#include<string.h>
void main()
{
	char str1[6]="Hello";
	char str2[6]="Hello";
	char* res=strstr(str2,str1);
	if(res!='\0')
	{
		printf("substring found:%s",res);
	}
	else
	{
		printf("substring not found:%s",res);
	}	
}
