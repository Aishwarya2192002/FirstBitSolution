#include<stdio.h>
#include<string.h>
void main()
{
	char str[100];
	int len,i;
	printf("Enter a String:");
	fgets(str,sizeof(str),stdin);
	len=strlen(str);
	for(i=0;i<len;i++)
	{
		if(str[i]== ' ')
		{
			str[i]='*';
		}
	}
	printf("New String:%s",str);
}
