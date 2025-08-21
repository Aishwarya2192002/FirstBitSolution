#include<stdio.h>
#include<string.h>
char* mystrlower(char*);
void main()
{
	char str1[]="WELCOME";
	char* res=mystrlower(str1);
	printf("%s",res);
}
char* mystrlower(char* str1)
{
	int i=0;
	while(str1[i]!='\0')
	{
		if(str1[i]>='a' && str1[i]<='z')
		{
			str1[i]=str1[i]+32;
		}
		i++;
	}
	return str1;
}
