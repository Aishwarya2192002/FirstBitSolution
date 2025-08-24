#include<stdio.h>
#include<string.h>
void main()
{
	char str1[100],str2[100];
	int len1=0 ,i,len2=0;
	printf("Enter a String:");
	scanf("%s",str1);
	printf("Enter a String:");
	scanf("%s",str2);
	for(i=0;str1[i]!='\0';i++)
	{
		len1++;
	}
	for(i=0;str2[i]!='\0';i++)
	{
		len2++;
	}
	if(len1>len2)
	{
		printf("Larger String is:%s",str1);
	}
	else if(len2>len1)
	{
		printf("Larger String is:%s",str2);
	}
	else
	{
		printf("Both string length are equal");
	}
}
	
