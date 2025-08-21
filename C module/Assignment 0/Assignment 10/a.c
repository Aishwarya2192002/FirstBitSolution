#include<stdio.h>
#include<string.h>
char* mystrcpy(char*,char*);
void main()
{
	char str1[6]="Hello";
	char str2[6];
	char* res=mystrcpy(str2,str1);
	printf("%s",res);
}
char* mystrcpy(char* s2,char* s1)
{
	int i=0;
	while(s1[i]!='\0')
	{
		s2[i]=s1[i];
		i++;
	}
	s2[i]='\0';
	return s2;
}
