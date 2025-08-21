#include<stdio.h>
#include<string.h>
int mystrncmp(char*,char*,int);
void main()
{
	char str1[]="Apple";
	char str2[]="banana";
	int res=mystrncmp(str2,str1,4);
	printf("%d",res);
}
int mystrncmp(char* str1,char* str2,int n)
{
	int i=0;
	while(i<n || str1[i]!='\0' || str2[i]!='\0')
	{
		if(str1[i]!=str2[i])
		{
			if(str1[i]>str2[i])
			    return 1;
			else
			    return 2;
		}
		i++;
	}
	return 0;
}
