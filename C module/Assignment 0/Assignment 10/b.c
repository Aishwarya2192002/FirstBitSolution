#include<stdio.h>
#include<string.h>
int mystrlen(char*);
void main()
{
	char str1[6]="Hello";
	int res=mystrlen(str1);
	printf("%d",res);
}
int mystrlen(char* p)
{
	int i=0;
	while(p[i]!='\0')
	{
		i++;
	}
	return i;
}
