#include<stdio.h>
void vowelconsonants(char *ch);
void main()
{
	char ch;
	printf("Enter a character:");
	scanf("%c",&ch);
   vowelconsonants(&ch);
}
void vowelconsonants(char *ch)
{
    if(*ch=='a'||*ch=='e'||*ch=='i'||*ch=='o'||*ch=='u')
    {
        printf("This is vowel");
    }
    else
    {
        printf("This is consonants");
    }
}
