#include<stdio.h>
#include<string.h>
int mystrncasecmp( const char*,const char*,int);
void main()
{
	char str1[]="Apple";
	char str2[]="Apply";
	int result=mystrncasecmp(str1,str2,3);
	if(result==0)
	{
		printf("String are equal\n");
	}
	else if(result<0)
	{
		printf("First String is Smaller\n");
	}
	else
	{
		printf("First String is Greater\n");
    }
	printf("%d",result);
}
char mytolower(char ch)
{
	if(ch>='A' && ch<='Z')
	   return ch+32;
	return ch;
}
int mystrncasecmp( const char* str1,const char* str2,int n)
{
	int i=0;
	while(i<n && *str1!='\0' && *str2!='\0')
	{
		char c1=mytolower(*str1);
		char c2=mytolower(*str2);
		if(c1!=c2)
		{
			return c1-c2;
		}
		str1++;
		str2++;
		i++;
	}
	if(i<n)
	{
		return mytolower(*str1)-mytolower(*str2);
	}
	
}






