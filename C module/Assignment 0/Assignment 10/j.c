#include<stdio.h>
#include<string.h>
int mystrcasecmp( const char*,const char*);
void main()
{
	char str1[]="Apple";
	char str2[]="Apple";
	int result=mystrcasecmp(str1,str2);
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
int mystrcasecmp( const char* str1,const char* str2)
{
	while(*str1!='\0' && *str2!='\0')
	{
		char c1=mytolower(*str1);
		char c2=mytolower(*str2);
		if(c1!=c2)
		{
			return c1-c2;
		}
		str1++;
		str2++;
	}
	return mytolower(*str1)-mytolower(*str2);
}






