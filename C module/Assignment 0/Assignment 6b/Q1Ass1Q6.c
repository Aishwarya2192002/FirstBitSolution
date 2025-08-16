#include<stdio.h>
void lowerupper(char *ch);
void main()
{
	char ch;
	printf("Enter a character:");
	scanf("%c",&ch);
   lowerupper(&ch);
}
void lowerupper(char *ch)
{
    if(*ch >= 'A' && *ch<= 'Z')
    {
        printf("This is upper case");
    }
    else
    {
        printf("This is lower case");
    }
}
