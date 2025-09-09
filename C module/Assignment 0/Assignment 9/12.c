#include<stdio.h>
#include<string.h>
void main()
{
	char str1[6]="World";
	char str2[20]="Hello";
	char* res=strncat(str2,str1,3);//strcat
	printf("%s",res);
}
