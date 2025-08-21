#include<stdio.h>
#include<string.h>
int mystrcmp(char*,char*);
void main()
{
	char str1[]="Apple";
	char str2[]="banana";
	int res=mystrcmp(str2,str1);
	printf("%d",res);
}
int mystrcmp(char* str1,char* str2)
{
	int i=0;
	while(str1[i]!='\0' || str2[i]!='\0')
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
