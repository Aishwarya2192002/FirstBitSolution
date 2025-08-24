#include<stdio.h>
#include<string.h>
void main()
{
	char str[100],result[100];
	int len,i,j=0;
	printf("Enter a String:");
	fgets(str,sizeof(str),stdin);
	len=strlen(str);
	for(i=0;i<len;i++)
	{
		if(i%2==0)
		{
			result[j]=str[i];
			j++;
		}
		result[j]='\0';
	}
	printf("After removing odd index:%s",result);
}
