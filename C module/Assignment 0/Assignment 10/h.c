#include<stdio.h>
#include<string.h>
char* mystrrev(char*);
void main()
{
	char str[]="WELCOME";
	char* res=mystrrev(str);
	printf("%s",res);
}
char* mystrrev(char* str)
{
	int i=0,j=0,k;
	char temp;
	while(str[i]!='\0')
	{
		i++;
	}
	k=i-1;
	
	while(j<k)
	{
		temp=str[j];
		str[j]=str[k];
		str[k]=temp;
		j++;
		k--;
	}
	return str;
}
