#include<stdio.h>
#include<string.h>
char* mystrcat(char*,char*);
void main()
{
	char str1[6]="World";
	char str2[6]="Hello";
	char* res=mystrcat(str2,str1);
	printf("%s",res);
}
char* mystrcat(char* str2,char* str1)
{
	int i=0,j=0;
	while(str2[i]!='\0')
	
		i++;

	while(str1[j]!='\0')
	{
		str2[i]=str1[j];
		j++;
		i++;
	}
	str2[i]='\0';
	return str2;
}
