#include<stdio.h>
#include<string.h>
void main()
{
	char str[100];
	int len ,i,count=0;
	printf("Enter a String:");
	fgets(str,sizeof(str),stdin);
	len=strlen(str);
	for(i=0;i<len;i++)
	{
		if((i==0 && str[i] !=' ')||(str[i] !=' ' && str[i-1]==' '))
		{
			count++;
		}
	}
	printf("Number of words in string:%d",count);
}
