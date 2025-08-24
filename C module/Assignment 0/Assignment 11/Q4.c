#include<stdio.h>
#include<string.h>
void main()
{
	char str[100],temp;
	int len;
	printf("Enter a String:");
	scanf("%s",&str);
	len=strlen(str);
	if(len>1)
	{
		temp=str[0];
		str[0]=str[len-1];
		str[len-1]=temp;
	}
	printf("New String:%s",str);
}
