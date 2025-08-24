#include<stdio.h>
#include<string.h>
void main()
{
	char str[100];
	int len,i,count=0;
	printf("Enter a String:");
	scanf("%s",str);
	len=strlen(str);
	for(i=0;i<len;i++)
	{
		char ch=tolower(str[i]);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='0' || ch=='u')
		{
			count ++;
		}
	}
	printf("Number of vowels in string :%d",count);
}
