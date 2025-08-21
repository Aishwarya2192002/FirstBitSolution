#include<stdio.h>
#include<string.h>
char* mystrcat(char*,char*,int);
void main()
{
	char str1[6]="World";
	char str2[20]="Hello";
	char* res=mystrcat(str2,str1,3);
	printf("%s",res);
}
char* mystrcat(char* str2,char* str1,int n)
{
	int i=0,j=0;
	while(str2[i]!='\0')
	
		i++;

	while(j<n && str1[j]!='\0')
	{
		str2[i]=str1[j];
		j++;
		i++;
	}
	str2[i]='\0';
	return str2;
}
