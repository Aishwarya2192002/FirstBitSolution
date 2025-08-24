#include<stdio.h>
#include<string.h>
void main()
{
	char str[100];
	int n,len;
	printf("Enter a String:");
	scanf("%s",&str);
	printf("Enter a Index to remove:");
	scanf("%d", &n);
	len=strlen(str);
	if(n < 0 || n >= len)
	{
		printf("Invlid Index \n");
	}
	else
	{
		strcpy(&str[n],&str[n+1]);
		printf("Modified String:%s",str);
	}
	
}
