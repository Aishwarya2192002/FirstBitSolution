#include<stdio.h>
#include<string.h>
void main()
{
	char str1[10]="World";
	char str2[10]="Hello";
	char* res=strcat(str2,str1);//strcat
	printf("%s",res);
}
