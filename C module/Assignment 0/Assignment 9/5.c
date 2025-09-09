#include<stdio.h>
#include<string.h>
void main()
{
	char str1[6]="Hello";
	char str2[6];
	char* res=strncpy(str2,str1,3);//strncpy
	printf("%s",res);
}
