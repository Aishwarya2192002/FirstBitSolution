#include<stdio.h>
#include<string.h>
char* mystrstr(char*,char*);
void main()
{
	char str1[6]="Hello";
	char str2[6]="Hello";
	char* res=mystrstr(str2,str1);
	if(res!=NULL)
	{
		printf("substring found:%s",res);
	}
	else
	{
		printf("substring not found:%s",res);
	}	
}
char* mystrstr(char* main,char* sub)
{
	int i=0,j;
	char* result=NULL;
	if(*sub=='\0')
	
		result=main;
	else
	{
		while(main[i]!='\0')
		{
			j=0;
		  while(main[i+j]!='\0' && sub[j]!='\0' && main[i+j]==sub[j])
		  {
			j++;
		  }
		  if(sub[j]=='\0')
		  {
			result=&main[i];
			break;
		  }
		  i++;
	   }
	}
	return result;
}

