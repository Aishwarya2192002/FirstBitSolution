#include<stdio.h>
#include<string.h>
void main()
{
	char str[100];
	char ch;
	char *res;
	printf("Enter  a String:");
	scanf("%s",str);
	printf("Enter a character to search:");
	scanf(" %c", &ch);
	res=strchr(str,ch);
	if(res!='\0')
	{
		printf("Character is found in string \n",ch);
	}
	else
	{
		printf("Character is not found in string\n",ch);
	}
}
