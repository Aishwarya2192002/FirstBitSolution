#include<stdio.h>
#include<string.h>
void main()
{
	char str[100];
	char *res;
	printf("Enter a String:");
	scanf("%s",&str);
	res=strchr(str,'a');
	while(res!='\0')
	{
		*res='$';
		res=strchr(res+1,'a');
	}
	printf("new String is:%s",str);
}
